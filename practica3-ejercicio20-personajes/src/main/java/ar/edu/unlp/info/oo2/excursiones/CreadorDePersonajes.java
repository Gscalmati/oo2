package ar.edu.unlp.info.oo2.excursiones;

public class CreadorDePersonajes {
	
private ConstructorP constructor;
	
	public void cambiarConstructor(ConstructorP con) {
		this.constructor = con;
	}
	
	public Personaje crearPersonaje(String nombre) {
		this.constructor.resetear();
		this.constructor.nombre(nombre);
		this.constructor.armadura();
		this.constructor.arma();
		this.constructor.clase();
		this.constructor.habilidades();
		return this.constructor.getPersonaje();	
		}
}
