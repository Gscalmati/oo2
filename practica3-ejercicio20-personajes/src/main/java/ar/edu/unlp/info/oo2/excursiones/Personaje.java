package ar.edu.unlp.info.oo2.excursiones;

public class Personaje {

	private String nombre;
	private String clase;
	private String habilidades;
	
	private String armadura;
	private int valorArmadura;
	
	private String arma;
	private String valorArma;
	
	private int vida = 100;
	
	public String getNombre() {
		return nombre;
	}

	public String getArmadura() {
		return armadura;
	}

	public void setArmadura(String armardura) {
		this.armadura = armardura;
	}

	public int getValorArmadura() {
		return valorArmadura;
	}

	public void setValorArmadura(int valorArmadura) {
		this.valorArmadura = valorArmadura;
	}

	public String getArma() {
		return arma;
	}

	public void setArma(String arma) {
		this.arma = arma;
	}

	public String getValorArma() {
		return valorArma;
	}

	public void setValorArma(String valorArma) {
		this.valorArma = valorArma;
	}

	public String getHabilidades() {
		return habilidades;
	}

	public void setHabilidades(String habilidades) {
		this.habilidades = habilidades;
	}

	public String getClase() {
		return clase;
	}

	public void setClase(String clase) {
		this.clase = clase;
	}

	public void setNombre(String nombre2) {
		// TODO Auto-generated method stub
		this.nombre = nombre2;
	}
	
	public void recibirDanio(int cantidad) {
		this.vida -= cantidad;
	}
	
	public int getVida() {
		return this.vida;
	}


}
