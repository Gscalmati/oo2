package ar.edu.unlp.info.oo2.excursiones;

public class PrestamoSimple extends Prestamo {

	private double tasa;
	private int cuotasPagadas;

	public PrestamoSimple(int cantCuotas, double monto, double tasa) {
		// TODO Auto-generated constructor stub
		super(cantCuotas, monto);
		this.tasa = tasa;
	}

	@Override
	protected double getInteres() {
		// TODO Auto-generated method stub
		return this.tasa;
	}
	
	@Override
	protected double getMontoAbonado() {
		// TODO Auto-generated method stub
		return this.cuotasPagadas * super.getCuota();
	}

	@Override
	protected double getMontoRestante() {
		// TODO Auto-generated method stub
		return super.getMontoTotal() - this.getMontoAbonado();
	}

	@Override
	protected void registrarCuota() {
		// TODO Auto-generated method stub
		this.cuotasPagadas++;
		
	}

	@Override
	protected double getGastoAdministrativo() {
		// TODO Auto-generated method stub
		return 0.1 * this.getMontoRestante();
	}

	@Override
	protected double getSellado() {
		// TODO Auto-generated method stub
		return 5000;
	}

	@Override
	protected int getCuotasPagadas() {
		// TODO Auto-generated method stub
		return this.cuotasPagadas;
	}

}
