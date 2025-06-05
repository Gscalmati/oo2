package ar.edu.unlp.info.oo2.excursiones;

import java.util.List;

public class EstadoDefinitiva extends Estado {

	@Override
	protected String obtenerInfo(Excursion context) {

		StringBuilder texto = new StringBuilder();
		
		texto.append(context.nombre + " - $" + context.costo + " - De: " + context.fechaInicio + " a: " + context.fechaFin + ", PdE: " + context.puntoEncuentro + ".");
		List<String> emails = context.emailsInscriptos();
		emails.stream().forEach(e -> {
		texto.append("\n " + e + ", \n");
		});
				
				
		texto.append("faltantes: " + context.cuposLibres());
		return texto.toString();
	}

	@Override
	protected void inscribir(Excursion context, Usuario unUsuario) {
		context.agregarUsuario(unUsuario);
		if (context.cantidadInscriptos() == context.getCupoMax()) {
			context.setEstado(new EstadoLlena());
		}
		
	}

}
