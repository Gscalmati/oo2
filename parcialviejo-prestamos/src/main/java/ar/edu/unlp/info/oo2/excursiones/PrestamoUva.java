package ar.edu.unlp.info.oo2.excursiones;

import java.util.List;

public class PrestamoUva extends Prestamo {

	private List<Double> cuotas;
	private double indice;
	
	public PrestamoUva(int cantCuotas, double monto) {
		// TODO Auto-generated constructor stub
		super(cantCuotas, monto);
	}

	@Override
	protected double getInteres() {
		// TODO Auto-generated method stub
		return 0.20;
	}

	@Override
	protected double getMontoAbonado() {
		// TODO Auto-generated method stub
		return this.cuotas.stream().mapToDouble(c -> c).sum();
	}

	@Override
	protected double getMontoRestante() {
		// TODO Auto-generated method stub
		return super.getMontoTotal() - this.getMontoAbonado();
	}

	@Override
	protected void registrarCuota() {
		// TODO Auto-generated method stub
		this.cuotas.add(super.getCuota());
		
	}

	@Override
	protected double getGastoAdministrativo() {
		// TODO Auto-generated method stub
		return 0.1 * this.getMontoRestante();
	}

	@Override
	protected double getSellado() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	protected int getCuotasPagadas() {
		// TODO Auto-generated method stub
		return this.cuotas.size();
	}

}
