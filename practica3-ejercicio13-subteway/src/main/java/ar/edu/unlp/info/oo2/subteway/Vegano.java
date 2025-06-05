package ar.edu.unlp.info.oo2.subteway;

public class Vegano implements Constructor {

	private Sandwich sandwich;
	
	public Sandwich getProducto() {
		return this.sandwich;
	}
	
	public void resetear() {
		this.sandwich = new Sandwich();
	}
	public void pan() {
		this.sandwich.setPan("Integral");
		this.sandwich.setPrecioPan(100);
	}
	
	public void aderezo() {
		this.sandwich.setAderezo("Salsa Criolla");
		this.sandwich.setPrecioAderezo(20);
	}
	public void principal() {
		this.sandwich.setPrincipal("Milanesa de Girgolas");
		this.sandwich.setPrecioPrincipal(500);
	}
	public void adicional() {
		this.sandwich.setAdicional("Sin");
		this.sandwich.setPrecioAdicional(0);
	}

}
