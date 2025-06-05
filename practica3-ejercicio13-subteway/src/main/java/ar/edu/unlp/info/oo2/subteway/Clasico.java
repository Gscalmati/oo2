package ar.edu.unlp.info.oo2.subteway;

public class Clasico implements Constructor {

	private Sandwich sandwich;
	
	public Sandwich getProducto() {
		return this.sandwich;
	}
	
	public void resetear() {
		this.sandwich = new Sandwich();
	}
	public void pan() {
		this.sandwich.setPan("Brioche");
		this.sandwich.setPrecioPan(100);
	}
	
	public void aderezo() {
		this.sandwich.setAderezo("Mayonesa");
		this.sandwich.setPrecioAderezo(20);
	}
	public void principal() {
		this.sandwich.setPrincipal("Carne de Ternera");
		this.sandwich.setPrecioPrincipal(300);
	}
	public void adicional() {
		this.sandwich.setAdicional("Tomate");
		this.sandwich.setPrecioAdicional(80);
	}

}
