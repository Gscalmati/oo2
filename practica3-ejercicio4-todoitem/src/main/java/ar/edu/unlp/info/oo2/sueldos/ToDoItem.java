package ar.edu.unlp.info.oo2.sueldos;

import java.time.Duration;
import java.time.Instant;
import java.util.ArrayList;
import java.util.List;

public class ToDoItem {	
	
	private EstadoItem estado;
	private String nombre;
	private List<String> coments;
	private Instant tiempoInicio;
	private Instant tiempoFin;
	
/**
* Instancia un ToDoItem nuevo en estado pending con <name> como nombre.
*/
        public ToDoItem(String name) {
        	this.nombre = name;
        	this.coments = new ArrayList<String>();
        	this.estado = new EstadoPendiente();
        }

   	/**
* Pasa el ToDoItem a in-progress, siempre y cuando su estado actual sea
* pending. Si se encuentra en otro estado, no hace nada.
*/
        public void start() {
        	this.estado.iniciar(this);
        }

	/**
* Pasa el ToDoItem a paused si su estado es in-progress, o a in-progress si su
* estado es paused. Caso contrario (pending o finished) genera un error
* informando la causa específica del mismo.
*/
        public void togglePause(){
        	this.estado.dispararPausa(this);
        }


	/**
* Pasa el ToDoItem a finished, siempre y cuando su estado actual sea 
* in-progress o paused. Si se encuentra en otro estado, no hace nada.
*/
        public void finish() {
        	this.estado.finalizar(this);
        }


	/**
* Retorna el tiempo que transcurrió desde que se inició el ToDoItem (start)
* hasta que se finalizó. En caso de que no esté finalizado, el tiempo que
* haya transcurrido hasta el momento actual. Si el ToDoItem no se inició,
* genera un error informando la causa específica del mismo.
*/
        public Duration workedTime() {
        	return this.tiempo();
        }


/**
* Agrega un comentario al ToDoItem siempre y cuando no haya finalizado. Caso
* contrario no hace nada."
*/
        public void addComment(String comment) {
        	if (this.estado.permitirComentario()) {
        		this.coments.add(comment);
        	}
        }
        
        protected EstadoItem getEstado() {
        	return this.estado;
        }
        
        protected void setEstado(EstadoItem nuevo) {
        	this.estado = nuevo;
        }

		public String getNombre() {
			// TODO Auto-generated method stub
			return this.nombre;
		}
		
		public List<String> getComments() {
			// TODO Auto-generated method stub
			return this.coments;
		}

		private Duration tiempo() {
			// TODO Auto-generated method stub
			
			if (this.tiempoInicio == null) {
				throw new RuntimeException("El Item no fue iniciado");
			}
			
			if (this.tiempoFin == null) {
				return Duration.between(tiempoInicio, Instant.now());
			}
			return Duration.between(tiempoInicio, tiempoFin);
		}

		protected Instant getTiempoActivo() {
			return tiempoInicio;
		}

		protected void setTiempoActivo(Instant tiempo) {
			this.tiempoInicio = tiempo;
		}

		public Instant getTiempoFin() {
			return tiempoFin;
		}

		public void setTiempoFin(Instant tiempoFin) {
			this.tiempoFin = tiempoFin;
		}
}