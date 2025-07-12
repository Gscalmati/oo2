package segundoCambio;

public class TipoLibre implements ITipo {

	@Override
	public double calcularRenta(Renta r) {
		// TODO Auto-generated method stub
		return r.calcularKmDias();
	}

}
