package ar.edu.unlp.info.oo2.sueldos;

public class EmpleadoTemporario extends Empleado {

	private int horasTrabajo;
	private int valorHora = 300;
	
	
	public EmpleadoTemporario (int horas, boolean esCasado, int hijos) {
		this.horasTrabajo = horas;
		this.setCantidadHijos(hijos);
		this.setEsCasado(esCasado);
	}
	@Override
	public double definirBasico() {
		// TODO Auto-generated method stub
		Double basico = this.getBasico() + (this.horasTrabajo * valorHora);
		return basico;
	}

	public void setHoras (int horas) {
		this.horasTrabajo = horas;
	}
	
	public int getHoras () {
		return this.horasTrabajo;
	}


}
