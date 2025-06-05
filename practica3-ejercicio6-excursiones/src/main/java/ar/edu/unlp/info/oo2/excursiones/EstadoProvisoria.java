package ar.edu.unlp.info.oo2.excursiones;

public class EstadoProvisoria extends Estado {

	protected void inscribir(Excursion context, Usuario unUsuario) {
		context.agregarUsuario(unUsuario);
		if (context.cantidadInscriptos() >= context.getCupoMin()) {
			context.setEstado(new EstadoDefinitiva());
		}
	}

	@Override
	protected String obtenerInfo(Excursion context) {

		return context.nombre + " - $" + context.costo + " - De: " + context.fechaInicio + " a: " + context.fechaFin + ", faltantes: " + context.cuposLibres();
	}
}
