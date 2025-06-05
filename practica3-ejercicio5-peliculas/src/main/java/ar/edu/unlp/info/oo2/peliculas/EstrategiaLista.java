package ar.edu.unlp.info.oo2.peliculas;

import java.util.List;

public interface EstrategiaLista {
	
	
	public List<Pelicula> listarSimilares(DecodificadorPeliculas context);
}
