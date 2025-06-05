package ar.edu.unlp.info.oo2.peliculas;

import java.util.List;
import java.util.stream.Collectors;

public class EstrategiaNovedad implements EstrategiaLista {

	@Override
	public List<Pelicula> listarSimilares(DecodificadorPeliculas context) {
		return context.getDisponibles().stream().sorted((ex1, ex2) -> 
     	 ex2.getFecha().compareTo(ex1.getFecha())).limit(3)
				.collect(Collectors.toList());
	}

}
