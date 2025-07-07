package ar.edu.unlp.info.oo2.excursiones;


public class Mago implements ConstructorP{

	private Personaje personaje;
	
	@Override
	public Personaje getPersonaje() {
		// TODO Auto-generated method stub
		return this.personaje;
	}

	@Override
	public void resetear() {
		// TODO Auto-generated method stub
		this.personaje = new Personaje();
	}

	@Override
	public void clase() {
		// TODO Auto-generated method stub
		this.personaje.setClase("Mago");
	}

	@Override
	public void arma() {
		// TODO Auto-generated method stub
		this.personaje.setArma("Baston");
	}

	@Override
	public void armadura() {
		// TODO Auto-generated method stub
		this.personaje.setArmadura("Cuero");
	}

	@Override
	public void habilidades() {
		// TODO Auto-generated method stub
		this.personaje.setHabilidades("Uso de Magia");
	}

	@Override
	public void nombre(String nombre) {
		// TODO Auto-generated method stub
		this.personaje.setNombre(nombre);
	}

}
