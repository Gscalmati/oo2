package ar.edu.unlp.info.oo2.sueldos;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class EmpleadoPasanteTest {


	Empleado pasanteSinNada;
	Empleado pasanteSoloExamenes;
	
	@BeforeEach
	void setUp() throws Exception {
		pasanteSinNada = new EmpleadoPasante(0);
		pasanteSoloExamenes = new EmpleadoPasante(5);

	}
	
	@Test
    public void testBasico() {
		assertEquals(20000, pasanteSinNada.definirBasico());
		assertEquals(20000, pasanteSoloExamenes.definirBasico());
    }
	
	
	@Test
    public void testAdicional() {
		
		assertEquals(0, pasanteSinNada.definirAdicionales());
		assertEquals(10000, pasanteSoloExamenes.definirAdicionales());

    }
	
	@Test
    public void testDescuentos() {
		assertEquals(sacarDescuentos(20000, 0), pasanteSinNada.definirDescuentos());
		assertEquals(sacarDescuentos(20000, 10000), pasanteSoloExamenes.definirDescuentos());
    }
	
	@Test
    public void testSueldo() {
		assertEquals(20000 - sacarDescuentos(20000, 0), pasanteSinNada.sueldo());
		assertEquals(30000 - sacarDescuentos(20000, 10000), pasanteSoloExamenes.sueldo());
		
    }
	
	public double sacarDescuentos(double basico, double adicional) {
		double descuentoBasico = ((basico * 13) / 100);
		double descuentoAdicional =  ((adicional * 5) / 100);
		
		return descuentoBasico + descuentoAdicional;
	}
	
}
