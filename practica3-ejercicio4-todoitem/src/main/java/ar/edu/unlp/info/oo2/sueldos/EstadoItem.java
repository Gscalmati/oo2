package ar.edu.unlp.info.oo2.sueldos;

import java.time.Duration;
import java.time.Instant;

public abstract class EstadoItem {


	public  void iniciar(ToDoItem context) {
	}
	
	public  void finalizar(ToDoItem context) {
	}

	public void dispararPausa(ToDoItem context) {
		// TODO Auto-generated method stub
		throw new RuntimeException("El Item no se encuentra en estado 'En Progreso' o ''Pausado");
		
	}

	public boolean permitirComentario() {
		// TODO Auto-generated method stub
		return true;
	}

	
}
