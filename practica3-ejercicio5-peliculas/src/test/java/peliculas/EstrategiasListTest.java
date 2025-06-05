package peliculas;
import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;

import ar.edu.unlp.info.oo2.peliculas.DecodificadorPeliculas;
import ar.edu.unlp.info.oo2.peliculas.EstrategiaNovedad;
import ar.edu.unlp.info.oo2.peliculas.EstrategiaPuntaje;
import ar.edu.unlp.info.oo2.peliculas.EstrategiaSimilares;
import ar.edu.unlp.info.oo2.peliculas.Pelicula;

public class EstrategiasListTest {

	private DecodificadorPeliculas decodificador;
	private Pelicula thor;
	private Pelicula capitan;
	private Pelicula iron;
	private Pelicula dunkirk;
	private Pelicula rocky;
	private Pelicula rambo;
	
	@BeforeEach
	public void setUp() {
		thor = new Pelicula("Thor", 2007, 7.9);
		capitan = new Pelicula("Capitán América", 2016, 7.8);
		iron = new Pelicula("Iron Man", 2010, 7.9);
		dunkirk = new Pelicula("Dunkirk", 2017, 7.9);
		rocky = new Pelicula("Rocky", 1976, 8.1);
		rambo = new Pelicula("Rambo", 1979, 7.8);
		
		decodificador = new DecodificadorPeliculas();
		
		decodificador.definirSimilitudEnPeliculas(thor, capitan);
		decodificador.definirSimilitudEnPeliculas(thor, iron);
		decodificador.definirSimilitudEnPeliculas(iron, capitan);
		decodificador.definirSimilitudEnPeliculas(rambo, rocky);
		
		decodificador.agregarPeliculaGrilla(thor);
		decodificador.agregarPeliculaGrilla(capitan);
		decodificador.agregarPeliculaGrilla(iron);
		decodificador.agregarPeliculaGrilla(dunkirk);
		decodificador.agregarPeliculaGrilla(rocky);
		decodificador.agregarPeliculaGrilla(rambo);
		
		decodificador.agregarPeliculaReproducida(thor);
		decodificador.agregarPeliculaReproducida(rocky);
		
	}
	@Test
	public void testEstrategiaNovedad() {
		decodificador.definirEstrategia(new EstrategiaNovedad());
		List<Pelicula> devolucion = decodificador.sugerirPeliculas();
		devolucion.stream().forEach(p -> System.out.println(p.getTitulo()));
		System.out.println("---------------------");
	}
	
	@Test
	public void testEstrategiaSimilares() {
		decodificador.definirEstrategia(new EstrategiaSimilares());
		List<Pelicula> devolucion2 = decodificador.sugerirPeliculas();
		devolucion2.stream().forEach(p -> System.out.println(p.getTitulo()));
		System.out.println("---------------------");
	}
	
	
	@Test
	public void testEstrategiaPuntaje() {
		decodificador.definirEstrategia(new EstrategiaPuntaje());
		//List<Pelicula> dispo = (decodificador.getDisponibles());
		//dispo.stream().forEach(p -> System.out.println(p.getTitulo()));
		//System.out.println("---------------------");
		List<Pelicula> devolucion1 = decodificador.sugerirPeliculas();
		devolucion1.stream().forEach(p -> System.out.println(p.getTitulo()));
		System.out.println("---------------------");
	}
	
	
	
}