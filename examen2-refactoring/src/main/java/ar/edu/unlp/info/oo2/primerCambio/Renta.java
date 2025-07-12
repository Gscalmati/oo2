package ar.edu.unlp.info.oo2.primerCambio;


/*
 * Bad Smells
 * 1 - Long Method -> calcularTotal()
 * 2 - Primitive Obsession -> tipoRenta como String
 * 3 - Duplicated Code -> linea 23 y 34
 * 4 - If statement -> enlazado al smell 2, linea 22-38 aprox
 *
 * Refactorings 
 * Para el Duplicated Code de la linea 23 y 24:
 * - Realizo un extract Method de la linea 23 a su propio método llamado "calcularKmRecorridos"
 * - Elimino esa linea y llamo directamente al método en la linea 24 en el calculo de "precio"
 * - Elimino la linea 34 y hago el mismo llamado al método en la linea 35 directamente con la operacion de return.
 *  
 * Long Method
 * - Realizo un Extract method de las lineas 26 a 30 a su propio método llamado "calcularAdicional()"
 * - Sustituyo la referencia de "adicional" con el nuevo método creado
 */

public class Renta {
	
	private Vehiculo vehiculo;
	private Cliente cliente;
	private int diasRenta;
	private String tipoRenta;
	private int kmInicial;
	
	public Renta(Vehiculo v, Cliente c, int dias) {
		this.vehiculo = v;
		this.cliente = c;
		this.diasRenta = dias;
		this.tipoRenta = "BASICO";
		this.kmInicial = v.getKilometraje();
	}
	
	public void setTipoRenta(String t) {
		this.tipoRenta = t;
	}
	
	private int calcularKmRecorridos() {
		return vehiculo.getKilometraje() - this.kmInicial;
	}
	
	private double calcularAdicional() {
		return (vehiculo.getAntiguedad() > 5) ? 0.85 : 1;
	}
	
	public double calcularTotal() {
		if (this.tipoRenta == "BASICO") {
			double precio = diasRenta * vehiculo.getPrecioPorDia() + this.calcularKmRecorridos() * vehiculo.getPrecioPorKm();
			
			return precio * this.calcularAdicional();
		} else if (this.tipoRenta == "PLUS") {
			return this.calcularKmRecorridos() * vehiculo.getPrecioPorKm();
		} else {
			return diasRenta * vehiculo.getPrecioPorDia();
		}
	}
}
