package ar.edu.unlp.info.oo2.sueldos;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class EmpleadoPlantaTest {


	Empleado plantaSinNada;
	Empleado plantaCasadoConHijo;
	Empleado plantaSolteroConHijo;
	Empleado plantaSolteroSinHijo;
	Empleado plantaCasadoSinHijo;
	Empleado plantaSolteroAntiguo;
	Empleado plantaCasadoAntiguo;
	
	@BeforeEach
	void setUp() throws Exception {
		plantaSinNada = new EmpleadoPlanta(0, false, 0);
		plantaCasadoConHijo = new EmpleadoPlanta(0, true, 1);
		plantaSolteroConHijo = new EmpleadoPlanta(0, false, 1);
		plantaSolteroSinHijo = new EmpleadoPlanta(0, false, 0);
		plantaCasadoSinHijo = new EmpleadoPlanta(0, true, 0);
		plantaSolteroAntiguo = new EmpleadoPlanta(5, false, 0);
		plantaCasadoAntiguo = new EmpleadoPlanta(5, true, 0);
	}
	
	@Test
    public void testBasico() {
		assertEquals(50000, plantaSinNada.definirBasico());
		
		assertEquals(50000, plantaCasadoConHijo.definirBasico());
		assertEquals(50000, plantaSolteroConHijo.definirBasico());
		
		assertEquals(50000, plantaSolteroSinHijo.definirBasico());
		assertEquals(50000, plantaCasadoSinHijo.definirBasico());
		
		assertEquals(50000, plantaSolteroAntiguo.definirBasico());
		assertEquals(50000, plantaCasadoAntiguo.definirBasico());
    }
	
	
	@Test
    public void testAdicional() {

		assertEquals(0, plantaSinNada.definirAdicionales());
		
		assertEquals(7000, plantaCasadoConHijo.definirAdicionales());
		assertEquals(2000, plantaSolteroConHijo.definirAdicionales());
		
		assertEquals(0, plantaSolteroSinHijo.definirAdicionales());
		assertEquals(5000, plantaCasadoSinHijo.definirAdicionales());
		
		assertEquals(10000, plantaSolteroAntiguo.definirAdicionales());
		assertEquals(15000, plantaCasadoAntiguo.definirAdicionales());
    }
	
	@Test
    public void testDescuentos() {
		assertEquals(sacarDescuentos(50000, 0), plantaSinNada.definirDescuentos());
		
		assertEquals(sacarDescuentos(50000, 7000), plantaCasadoConHijo.definirDescuentos());
		assertEquals(sacarDescuentos(50000, 2000), plantaSolteroConHijo.definirDescuentos());
		
		assertEquals(sacarDescuentos(50000, 0), plantaSolteroSinHijo.definirDescuentos());
		assertEquals(sacarDescuentos(50000, 5000), plantaCasadoSinHijo.definirDescuentos());
		
		assertEquals(sacarDescuentos(50000, 10000), plantaSolteroAntiguo.definirDescuentos());
		assertEquals(sacarDescuentos(50000, 15000), plantaCasadoAntiguo.definirDescuentos());
    }
	
	@Test
    public void testSueldo() {
		assertEquals(50000 - sacarDescuentos(50000, 0), plantaSinNada.sueldo());
		
		assertEquals(57000 - sacarDescuentos(50000, 7000), plantaCasadoConHijo.sueldo());
		assertEquals(52000 - sacarDescuentos(50000, 2000), plantaSolteroConHijo.sueldo());
		
		assertEquals(50000 - sacarDescuentos(50000, 0), plantaSolteroSinHijo.sueldo());
		assertEquals(55000 - sacarDescuentos(50000, 5000), plantaCasadoSinHijo.sueldo());
		
		assertEquals(60000 - sacarDescuentos(50000, 10000), plantaSolteroAntiguo.sueldo());
		assertEquals(65000 - sacarDescuentos(50000, 15000), plantaCasadoAntiguo.sueldo());
    }
	
	public double sacarDescuentos(double basico, double adicional) {
		double descuentoBasico = ((basico * 13) / 100);
		double descuentoAdicional =  ((adicional * 5) / 100);
		
		return descuentoBasico + descuentoAdicional;
	}
	
}
