package ar.edu.unlp.info.oo2.excursiones;

public class EstadoAprobado implements Estado {

	@Override
	public void pagarCuota(Prestamo prestamo) {
		// TODO Auto-generated method stub
		prestamo.registrarCuota();
		if (prestamo.getCantCuotas() == prestamo.getCuotasPagadas()) {
			prestamo.setEstado(new EstadoFinalizado());
		}
	}

	@Override
	public double gastosCancelacion(Prestamo prestamo) {
		// TODO Auto-generated method stub
		return prestamo.getMontoRestante() + prestamo.getGastoAdministrativo() + prestamo.getSellado();
	}

}
