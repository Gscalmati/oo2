package segundoCambio;

public class Vehiculo {

	private int kilometraje;
	private int antiguedad;
	
	public Vehiculo (int km, int ant) {
		this.kilometraje = km;
		this.antiguedad = ant;
	}
	
	public double getPrecioPorDia() {
		return 5000;
	}
	
	public int getKilometraje() {
		return this.kilometraje;
	}
	
	public int getAntiguedad() {
		return this.antiguedad;
	}
	
	public double getPrecioPorKm() {
		return 400;
	}
	
	public void aumentarKilometraje(int cantidadKm) {
		this.kilometraje += cantidadKm;
	}
}
