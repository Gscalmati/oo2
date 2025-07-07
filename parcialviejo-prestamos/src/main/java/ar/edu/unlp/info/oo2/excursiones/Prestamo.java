package ar.edu.unlp.info.oo2.excursiones;

public abstract class Prestamo {
	
	private int cantCuotas;
	private double montoTotal;
	private Estado estado;
	

	public Prestamo(int cantCuotas, double monto) {
		// TODO Auto-generated constructor stub
		this.cantCuotas = cantCuotas;
		this.montoTotal = monto;
	}
	
	public void setEstado(Estado e) {
		this.estado = e;
	}

	public double getCuota() {
		// TODO Auto-generated method stub
		return ((this.getMontoTotal() * this.getCantCuotas()) / this.getInteres());
	}

	public double getMontoTotal() {
		// TODO Auto-generated method stub
		return this.montoTotal;
	}

	public int getCantCuotas() {
		// TODO Auto-generated method stub
		return this.cantCuotas;
	}

	protected abstract void registrarCuota();
	protected abstract double getInteres();
	protected abstract double getMontoAbonado();
	protected abstract double getMontoRestante();
	protected abstract double getGastoAdministrativo();
	protected abstract double getSellado();
	protected abstract int getCuotasPagadas();
	
	public void pagarCuota() {
		this.estado.pagarCuota(this);
	}
	
	public double gastosCancelacion() {
		return this.estado.gastosCancelacion(this);
	}



}
