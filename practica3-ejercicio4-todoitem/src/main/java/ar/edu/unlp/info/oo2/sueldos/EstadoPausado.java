package ar.edu.unlp.info.oo2.sueldos;

import java.time.Instant;

public class EstadoPausado extends EstadoItem {

	public void dispararPausa(ToDoItem context) {
		// TODO Auto-generated method stub
		context.setEstado(new EstadoEnProgreso());
		
	}
	
	public  void finalizar(ToDoItem context) {
		context.setEstado(new EstadoFinalizado());
		context.setTiempoFin(Instant.now());
	}
}
