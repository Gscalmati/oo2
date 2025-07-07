package ar.edu.unlp.info.oo2.excursiones;

public class Videojuego {
	
	private CreadorDePersonajes director;
	
	
	public Videojuego () {
		this.director = new CreadorDePersonajes();
	}
	
	public Personaje crearMago(String nombre) {
		Mago m = new Mago();
		this.director.cambiarConstructor(m);
		
		return this.director.crearPersonaje(nombre);
	}
}
