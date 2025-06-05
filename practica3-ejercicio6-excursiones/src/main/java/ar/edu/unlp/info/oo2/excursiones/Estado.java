package ar.edu.unlp.info.oo2.excursiones;

public abstract class Estado {

	
	protected abstract String obtenerInfo(Excursion context);

	protected abstract void inscribir(Excursion excursion, Usuario unUsuario);
}
