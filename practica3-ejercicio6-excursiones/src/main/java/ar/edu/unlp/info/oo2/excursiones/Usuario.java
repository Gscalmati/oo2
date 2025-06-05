package ar.edu.unlp.info.oo2.excursiones;

public class Usuario {

	private String nombre;
	private String apellido;
	private String email;
	
	public Usuario (String n, String a, String e) {
		this.apellido = a;
		this.nombre = n;
		this.email = e;
	}
	public String toString() {
		return this.nombre + " " + this.nombre + " - " + this.email;
	}

	public String getEmail() {
		// TODO Auto-generated method stub
		return this.email;
	}
}
