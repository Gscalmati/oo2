package ar.edu.unlp.info.oo2.excursiones;

import static org.junit.Assert.assertEquals;

import java.time.LocalDate;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;



public class ExcursionTest {

	
	private Excursion exc;
	private Usuario u1;
	private Usuario u2;
	
	
	@BeforeEach
	public  void setUp() {
		LocalDate inicio = LocalDate.of(2025, 2, 6);
		LocalDate fin = LocalDate.of(2025, 5, 6);
		exc = new Excursion("Dos días en kayak bajando el Paraná", "Buenos Aires", inicio, fin , 60000.00, 1, 2);
		u1 = new Usuario("Gio", "Sarasa", "giotest@gmail.com");
		u2 = new Usuario("Juli", "Brujuli", "julitest@gmail.com");
	}
	
	@Test
	public void testEstadoProvisoria() {
		System.out.println(exc.obtenerInformacion());
		System.out.println("----------------------");
		assertEquals(0, exc.cantidadInscriptos());
	}
	
	
	@Test
	public void testEstadoFinalizada() {
		exc.inscribir(u1);
		System.out.println(exc.obtenerInformacion());
		System.out.println("----------------------");
		assertEquals(1, exc.cantidadInscriptos());
	}
	
	
	@Test
	public void testEstadoLlena() {
		exc.inscribir(u1);
		exc.inscribir(u2);
		System.out.println(exc.obtenerInformacion());
		System.out.println("----------------------");
		assertEquals(2, exc.cantidadInscriptos());
		exc.inscribir(new Usuario("El", "Nuevo", "testLleno@gmail.com"));
		assertEquals(1, exc.cantidadListaEspera());
	}
	
}
