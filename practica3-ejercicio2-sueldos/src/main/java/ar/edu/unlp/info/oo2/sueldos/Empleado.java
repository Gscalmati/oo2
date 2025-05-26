package ar.edu.unlp.info.oo2.sueldos;

public abstract class Empleado {
	
	private boolean esCasado;
	private int cantidadHijos;
	private double basico = 20000;
	
	public double sueldo() {
		return ((this.definirBasico() + this.definirAdicionales()) - this.definirDescuentos());
	}
	
	
	public double definirBasico() {
		// TODO Auto-generated method stub
		return this.getBasico();
	}
	
	public double definirDescuentos() {
		// TODO Auto-generated method stub
		
		double descuentoBasico = ((this.definirBasico() * 13) / 100);
		double descuentoAdicional =  ((this.definirAdicionales() * 5) / 100);
		
		double descuentos = descuentoBasico + descuentoAdicional;
		return descuentos;
	}
	
	public double definirAdicionales() {
		// TODO Auto-generated method stub
		int adicionalCasado = this.getEsCasado() ? 5000 : 0;
		int adicionalHijos = this.getCantidadHijos() * 2000;
		double adicionales = adicionalCasado + adicionalHijos;
		
		return adicionales;
	}

	public boolean getEsCasado() {
		return esCasado;
	}

	public void setEsCasado(boolean esCasado) {
		this.esCasado = esCasado;
	}

	public int getCantidadHijos() {
		return cantidadHijos;
	}

	public void setCantidadHijos(int cantidadHijos) {
		this.cantidadHijos = cantidadHijos;
	}
	
	public double getBasico() {
		return this.basico;
	}

	public void setBasico(double basico) {
		this.basico = basico;
	}
}
