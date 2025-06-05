package peliculas;
import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;

import ar.edu.unlp.info.oo2.peliculas.Pelicula;

public class PeliculaTest {

	private Pelicula peli1;
	private Pelicula peli2;
	
	@BeforeEach
	public void setUp() {
		peli1 = new Pelicula("Hombres de Negro", 1997, 7.3);
		peli2 = new Pelicula("Soy Leyenda", 2007, 7.2);
	}
	
	@Test
	public void testSimilitud() {
		peli1.definirSimilitud(peli2);
		
		assertEquals(1, peli1.getSimilares().size());
	}
	
}
