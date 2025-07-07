package ar.edu.unlp.info.oo2.excursiones;

public class EstadoFinalizado implements Estado{

	@Override
	public void pagarCuota(Prestamo prestamo) {
		// TODO Auto-generated method stub
		throw new Error("Error");
	}

	@Override
	public double gastosCancelacion(Prestamo prestamo) {
		// TODO Auto-generated method stub
		return 0;
	}

}
