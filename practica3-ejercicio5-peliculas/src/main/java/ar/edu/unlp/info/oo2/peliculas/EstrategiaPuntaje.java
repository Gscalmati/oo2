package ar.edu.unlp.info.oo2.peliculas;

import java.util.List;
import java.util.stream.Collectors;

public class EstrategiaPuntaje implements EstrategiaLista {

	@Override
	public List<Pelicula> listarSimilares(DecodificadorPeliculas context) {
		List<Pelicula> peliculasDisponibles = context.getDisponibles();
		
		return peliculasDisponibles.stream().sorted((ex1, ex2) -> {
		// Transformo la comparacion en un valor para validar
		int comparation = ex2.getPuntaje().compareTo(ex1.getPuntaje());
		// Comparo el resultado, si es igual (mismo puntaje), comparo por fecha
		if (comparation == 0) {
			return ex2.getFecha().compareTo(ex1.getFecha());
		} else {
			return comparation;
		}
						
		})
		.limit(3)
 .collect(Collectors.toList());
	}

}
