package peliculas;
import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;

import ar.edu.unlp.info.oo2.peliculas.DecodificadorPeliculas;
import ar.edu.unlp.info.oo2.peliculas.Pelicula;

public class DecodificadorPeliculasTest {

	private DecodificadorPeliculas decodificador;
	private Pelicula peli1;
	private Pelicula peli2;
	
	@BeforeEach
	public void setUp() {
		peli1 = new Pelicula("Hombres de Negro", 1997, 7.3);
		peli2 = new Pelicula("Soy Leyenda", 2007, 7.2);
		decodificador = new DecodificadorPeliculas();
	}
	
	@Test
	public void testDefinirSimilitud() {
		decodificador.definirSimilitudEnPeliculas(peli1, peli2);
		assertEquals(1, peli1.getSimilares().size());
		assertEquals(1, peli2.getSimilares().size());
	}
	
	@Test
	public void testAgregarGrilla() {
		decodificador.agregarPeliculaGrilla(peli1);
		decodificador.agregarPeliculaGrilla(peli2);
		assertEquals(2, decodificador.getGrilla().size());
	}
	
	@Test
	public void testAgregarPeliReproducida() {
		decodificador.agregarPeliculaGrilla(peli1);
		decodificador.agregarPeliculaGrilla(peli2);
		decodificador.agregarPeliculaReproducida(peli1);
		assertEquals(1, decodificador.getReproducidas().size());
	}
	
}
