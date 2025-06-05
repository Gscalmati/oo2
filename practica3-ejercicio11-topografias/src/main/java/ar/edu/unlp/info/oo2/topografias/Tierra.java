package ar.edu.unlp.info.oo2.topografias;

public class Tierra implements Topografia {

	@Override
	public double calcularProporcion() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Boolean esIgualA(Topografia top) {
		// TODO Auto-generated method stub
		return (top instanceof Tierra);
	}
	
	

}
