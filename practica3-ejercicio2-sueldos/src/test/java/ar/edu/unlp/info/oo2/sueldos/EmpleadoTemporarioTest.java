package ar.edu.unlp.info.oo2.sueldos;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class EmpleadoTemporarioTest {


	Empleado temporarioSinNada;
	Empleado temporarioSoloHoras;
	Empleado temporarioCasadoConHijo;
	Empleado temporarioSolteroConHijo;
	Empleado temporarioSolteroSinHijo;
	Empleado temporarioCasadoSinHijo;
	
	@BeforeEach
	void setUp() throws Exception {
		temporarioSinNada = new EmpleadoTemporario(0, false, 0);
		temporarioSoloHoras = new EmpleadoTemporario(5, false, 0);
		temporarioCasadoConHijo = new EmpleadoTemporario(0, true, 1);
		temporarioSolteroConHijo = new EmpleadoTemporario(0, false, 1);
		temporarioCasadoSinHijo = new EmpleadoTemporario(0, true, 0);
		temporarioSolteroSinHijo = new EmpleadoTemporario(0, false, 0);
	}
	
	@Test
    public void testBasico() {
		assertEquals(20000, temporarioSinNada.definirBasico());
		assertEquals(21500, temporarioSoloHoras.definirBasico());
    }
	
	
	@Test
    public void testAdicional() {
		
		assertEquals(7000, temporarioCasadoConHijo.definirAdicionales());
		assertEquals(2000, temporarioSolteroConHijo.definirAdicionales());
		
		assertEquals(5000, temporarioCasadoSinHijo.definirAdicionales());
		assertEquals(0, temporarioSolteroSinHijo.definirAdicionales());
    }
	
	@Test
    public void testDescuentos() {
		assertEquals(sacarDescuentos(20000, 0), temporarioSinNada.definirDescuentos());
		assertEquals(sacarDescuentos(21500, 0), temporarioSoloHoras.definirDescuentos());
		
		assertEquals(sacarDescuentos(20000, 7000), temporarioCasadoConHijo.definirDescuentos());
		assertEquals(sacarDescuentos(20000, 2000), temporarioSolteroConHijo.definirDescuentos());
		
		assertEquals(sacarDescuentos(20000, 5000), temporarioCasadoSinHijo.definirDescuentos());
		assertEquals(sacarDescuentos(20000, 0), temporarioSolteroSinHijo.definirDescuentos());
    }
	
	@Test
    public void testSueldo() {
		assertEquals(20000 - sacarDescuentos(20000, 0), temporarioSinNada.sueldo());
		assertEquals(21500 - sacarDescuentos(21500, 0), temporarioSoloHoras.sueldo());
		
		assertEquals(27000 - sacarDescuentos(20000, 7000), temporarioCasadoConHijo.sueldo());
		assertEquals(22000 - sacarDescuentos(20000, 2000), temporarioSolteroConHijo.sueldo());
		
		assertEquals(25000 - sacarDescuentos(20000, 5000), temporarioCasadoSinHijo.sueldo());
		assertEquals(20000 - sacarDescuentos(20000, 0), temporarioSolteroSinHijo.sueldo());
    }
	
	public double sacarDescuentos(double basico, double adicional) {
		double descuentoBasico = ((basico * 13) / 100);
		double descuentoAdicional =  ((adicional * 5) / 100);
		
		return descuentoBasico + descuentoAdicional;
	}
	
}
