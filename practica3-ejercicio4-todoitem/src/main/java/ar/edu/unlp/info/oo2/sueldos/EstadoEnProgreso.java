package ar.edu.unlp.info.oo2.sueldos;

import java.time.Instant;

public class EstadoEnProgreso extends EstadoItem {

	public void dispararPausa(ToDoItem context) {
		// TODO Auto-generated method stub
		context.setEstado(new EstadoPausado());
		
	}
	
	public  void finalizar(ToDoItem context) {
		context.setEstado(new EstadoFinalizado());
		context.setTiempoFin(Instant.now());
	}
}
