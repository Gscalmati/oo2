package ar.edu.unlp.info.oo2.peliculas;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class DecodificadorPeliculas {

	
	private List<Pelicula> grillaPeliculas;
	private List<Pelicula> peliculasReproducidas;
	private EstrategiaLista estrategia;
	
	public DecodificadorPeliculas() {
		this.grillaPeliculas = new ArrayList<Pelicula>();
		this.peliculasReproducidas = new ArrayList<Pelicula>();
	}
	
	public void definirSimilitudEnPeliculas(Pelicula peli1, Pelicula peli2) {
			peli1.definirSimilitud(peli2);
			peli2.definirSimilitud(peli1);
	}
	
	public void definirEstrategia(EstrategiaLista nuevaE) {
		this.estrategia = nuevaE;
	}
	
	public List<Pelicula> sugerirPeliculas() {
		if (this.estrategia == null) {
	        throw new RuntimeException("No hay estrategia definida");
	    }
	    return this.estrategia.listarSimilares(this);
	}
	
	public void agregarPeliculaGrilla(Pelicula p) {
		this.grillaPeliculas.add(p);
	}
	
	public void agregarPeliculaReproducida(Pelicula p) {
		this.peliculasReproducidas.add(p);
	}
	
	public List<Pelicula> getGrilla() {
		return this.grillaPeliculas;
	}
	
	public List<Pelicula> getReproducidas() {
		return this.peliculasReproducidas;
	}
	
	public List<Pelicula> getSimilaresReproducidas() {
	    return this.peliculasReproducidas.stream()
	        .flatMap(p -> p.getSimilares().stream()) // junta todos los similares en un solo stream
	        .distinct() // elimina duplicados
	        .filter(p -> !this.peliculasReproducidas.contains(p)) // no recomendar reproducidas
	        .toList(); // lo convierte en lista
	}

	/*
	public List<Pelicula> getSimilaresReproducidas() {
		// TODO Auto-generated method stub
		List<Pelicula> pelisSimilares = new ArrayList<Pelicula>();
		this.peliculasReproducidas.stream().forEach(p -> p.getSimilares().stream().forEach(similar -> pelisSimilares.add(similar)));;
		return pelisSimilares;
	}
	*/
	
	/*
	public List<Pelicula> getDisponibles() {
		return this.getGrilla().stream().filter((p) -> this.getReproducidas().stream().anyMatch(peliVista -> !(peliVista.getTitulo().equals(p.getTitulo())))).toList();
	}
	*/
	
	public List<Pelicula> getDisponibles() {
	    return this.grillaPeliculas.stream()
	        .filter(p -> !this.peliculasReproducidas.contains(p))
	        .toList();
	}
	
}
