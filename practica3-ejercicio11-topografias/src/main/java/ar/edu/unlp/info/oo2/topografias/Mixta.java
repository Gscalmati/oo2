package ar.edu.unlp.info.oo2.topografias;

import java.util.ArrayList;
import java.util.List;

public class Mixta implements Topografia {

	private List<Topografia> partes;

	public Mixta() {
		this.partes = new ArrayList<Topografia>();
	}
	
	@Override
	public double calcularProporcion() {
		// TODO Auto-generated method stub
		return (this.partes.stream().mapToDouble(p->p.calcularProporcion())
				 .sum()) / 4;
	}
	
	public void agregarParte(Topografia t) {
		if (this.partes.size() < 4) {
			this.partes.add(t);
		}
	}
	
	@Override
	public Boolean esIgualA(Topografia top) {
		// TODO Auto-generated method stub
		if (!(top instanceof Mixta)) {
			return false;
		} else {			
			return this.partes.equals(top);
		}
	}


	
}
