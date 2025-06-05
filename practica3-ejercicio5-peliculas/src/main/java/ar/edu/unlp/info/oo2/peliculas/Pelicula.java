package ar.edu.unlp.info.oo2.peliculas;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Pelicula {	
	
	private String titulo;
	private Integer fechaEstreno;
	private Double puntaje;
	private List<Pelicula> peliculasSimilares;
	
	public Pelicula(String tit, Integer fecha, Double punt) {
		this.titulo = tit;
		this.fechaEstreno = fecha;
		this.puntaje = punt;
		this.peliculasSimilares = new ArrayList<Pelicula>();
	}
	
	public void definirSimilitud(Pelicula peliSimilar) {
		// TODO Auto-generated method stub
		this.peliculasSimilares.add(peliSimilar);
	}

	public String getTitulo() {
		// TODO Auto-generated method stub
		return this.titulo;
	}
	
	public Integer getFecha() {
		// TODO Auto-generated method stub
		return this.fechaEstreno;
	}

	public Double getPuntaje() {
		// TODO Auto-generated method stub
		return this.puntaje;
	}

	public List<Pelicula> getSimilares() {
		// TODO Auto-generated method stub
		return this.peliculasSimilares;
	}
	
	
	

	
}