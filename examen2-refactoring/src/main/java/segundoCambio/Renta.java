package segundoCambio;


/*
 * Bad Smells
 *
 * Refactorings 
 * Para el If statement y el Primitive Obession de las lineas 22 a 38 y linea 5 respectivamente, 
 * vamos a aplicar "REPLACE TYPE CODE WITH STRATEGY". Para Eso:
 * - Creamos 1 interfaz llamada ITipo
 * - Le agregamos un método llamado "calcularRenta" con un parametro Renta
 * - Creamos 3 clases que implementen IRenta: TipoBasica, TipoPlus, TipoLibre
 * - Creamos en cada una el mismo método que implementa de ITipo, con su misma firma
 * - Realizamos un extract method del return de tipo "KILOMETRAJE_LIBRE" y creo el metodo calcularCostoTotalDeDias
 * - Sustituyo la primer parte del calculo de precio en tipo "BASICO" por calcularCostoTotalDeDias
 * - Realizamos un extract method del return de tipo "PLUS" y creo el metodo calcularCostoKmRecorridos
 * - Sustituyo la segunda parte del calculo de precio en tipo "BASICO" por calcularCostoKmRecorridos
 * - Elimino la variable precio y asigno la cuenta al return directamente
 * - Copiamos las lineas correspondientes del if a cada método de cada subclase, respectivamente.
 * - Cambiamos las referencias en los metodos para el parametro recibido en los metodos calcularRenta
 * - Eliminamos el codigo del condicional del metodo original
 * - Cambiamos el tipo de dato de tipoRenta a ITipo
 * - Cambiamos las referencias en setTipoRenta para el nuevo tipo de dato
 * - Llamamos al metodo calcularRenta dentro del metodo calcularTotal.
 */

public class Renta {
	
	private Vehiculo vehiculo;
	private Cliente cliente;
	private int diasRenta;
	private ITipo tipoRenta;
	private int kmInicial;
	
	public Renta(Vehiculo v, Cliente c, int dias) {
		this.vehiculo = v;
		this.cliente = c;
		this.diasRenta = dias;
		this.tipoRenta = new TipoBasica();
		this.kmInicial = v.getKilometraje();
	}
	
	public void setTipoRenta(ITipo t) {
		this.tipoRenta = t;
	}
	
	protected int calcularKmRecorridos() {
		return vehiculo.getKilometraje() - this.kmInicial;
	}
	
	protected double calcularAdicional() {
		return (vehiculo.getAntiguedad() > 5) ? 0.85 : 1;
	}
	
	protected double calcularKmDias() {
		return diasRenta * vehiculo.getPrecioPorDia();
	}
	
	protected double calcularCostoKmRecorridos() {
		return this.calcularKmRecorridos() * vehiculo.getPrecioPorKm();
	}
	
	public double calcularTotal() {
		return this.tipoRenta.calcularRenta(this);
	}
}
