package ar.edu.unlp.info.oo2.subteway;

public class Vegetariano implements Constructor {

	private Sandwich sandwich;
	
	public Sandwich getProducto() {
		return this.sandwich;
	}
	
	public void resetear() {
		this.sandwich = new Sandwich();
	}
	public void pan() {
		this.sandwich.setPan("Pan con Semillas");
		this.sandwich.setPrecioPan(120);
	}
	
	public void aderezo() {
		this.sandwich.setAderezo("Sin");
		this.sandwich.setPrecioAderezo(0);
	}
	public void principal() {
		this.sandwich.setPrincipal("Provoleta Grillada");
		this.sandwich.setPrecioPrincipal(200);
	}
	public void adicional() {
		this.sandwich.setAdicional("Berenjenas en Escabeche");
		this.sandwich.setPrecioAdicional(100);
	}

}
