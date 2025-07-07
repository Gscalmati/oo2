package ar.edu.unlp.info.oo2.excursiones;

public interface Estado {

	void pagarCuota(Prestamo prestamo);

	double gastosCancelacion(Prestamo prestamo);

}
