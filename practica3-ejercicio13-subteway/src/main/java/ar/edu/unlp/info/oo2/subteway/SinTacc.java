package ar.edu.unlp.info.oo2.subteway;

public class SinTacc implements Constructor {

	private Sandwich sandwich;
	
	public Sandwich getProducto() {
		return this.sandwich;
	}
	
	public void resetear() {
		this.sandwich = new Sandwich();
	}
	public void pan() {
		this.sandwich.setPan("Pan de Chipá");
		this.sandwich.setPrecioPan(150);
	}
	
	public void aderezo() {
		this.sandwich.setAderezo("Salsa Tártara");
		this.sandwich.setPrecioAderezo(18);
	}
	public void principal() {
		this.sandwich.setPrincipal("Pechuga de Pollo");
		this.sandwich.setPrecioPrincipal(250);
	}
	public void adicional() {
		this.sandwich.setAdicional("Verduras Grilladas");
		this.sandwich.setPrecioAdicional(200);
	}

}
