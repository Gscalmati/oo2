package ar.edu.unlp.info.oo2.sueldos;

public class EmpleadoPasante extends Empleado {
	
	private int examenRendido;

	
	public EmpleadoPasante (int examenes) {
		this.examenRendido = examenes;
	}
	
	@Override
	public double definirAdicionales() {
		// TODO Auto-generated method stub
		int adicionalExamen = this.examenesRendidos() * 2000;
		double adicionales = adicionalExamen;
		
		return adicionales;
	}

	private int examenesRendidos() {
		// TODO Auto-generated method stub
		return this.examenRendido;
	}

	public void setRindeExamen(int rinde) {
		// TODO Auto-generated method stub
		this.examenRendido = rinde;
	}

}
