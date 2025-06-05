package ar.edu.unlp.info.oo2.topografias;

public class Pantano implements Topografia {

	@Override
	public double calcularProporcion() {
		// TODO Auto-generated method stub
		return 0.7;
	}

	@Override
	public Boolean esIgualA(Topografia top) {
		// TODO Auto-generated method stub
		return (top instanceof Pantano);	}

}
