package ar.edu.unlp.info.oo2.peliculas;

import java.util.List;

public class EstrategiaSimilares implements EstrategiaLista {

	@Override
	public List<Pelicula> listarSimilares(DecodificadorPeliculas context) {
		// TODO Auto-generated method stub
		List<Pelicula> peliculasDisponibles = context.getDisponibles();		
		List<Pelicula> peliculasSimilares = context.getSimilaresReproducidas();		
		
		return peliculasDisponibles.stream()
				.filter(peliD -> peliculasSimilares.contains(peliD))
				.sorted((p1, p2) -> p2.getFecha().compareTo(p1.getFecha()))
				.limit(3).toList();
		
		
		/*
		return peliculasDisponibles.stream()
			    .filter(peliculasSimilares::contains)
			    .sorted((p1, p2) -> p2.getFecha().compareTo(p1.getFecha()))
			    .limit(3)
			    .toList();
			    */
	}

}
