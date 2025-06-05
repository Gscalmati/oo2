package ar.edu.unlp.info.oo2.subteway;

public class SubteWay {

	private Constructor constructor;
	
	public void cambiarConstructor(Constructor con) {
		this.constructor = con;
	}
	
	public Sandwich crearSanguche() {
		this.constructor.resetear();
		this.constructor.pan();
		this.constructor.aderezo();
		this.constructor.principal();
		this.constructor.adicional();
		return this.constructor.getProducto();	
		}
	
}
