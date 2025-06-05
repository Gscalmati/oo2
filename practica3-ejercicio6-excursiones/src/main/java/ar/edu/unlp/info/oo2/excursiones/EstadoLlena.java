package ar.edu.unlp.info.oo2.excursiones;

public class EstadoLlena extends Estado {

	@Override
	protected String obtenerInfo(Excursion context) {
		return context.nombre + " - $" + context.costo + " - De: " + context.fechaInicio + " a: " + context.fechaFin + ", PdE: " + context.puntoEncuentro + ".";
	}

	@Override
	protected void inscribir(Excursion context, Usuario unUsuario) {
		context.agregarUsuarioListaEspera(unUsuario);

	}

}
