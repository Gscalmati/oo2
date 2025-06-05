package ar.edu.unlp.info.oo2.sueldos;

import java.time.Instant;

public class EstadoPendiente extends EstadoItem {
	
	public void iniciar(ToDoItem context) {
		context.setEstado(new EstadoEnProgreso());
		context.setTiempoActivo(Instant.now());
	}

}
