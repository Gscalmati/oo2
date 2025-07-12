package segundoCambio;

public class TipoPlus implements ITipo {

	@Override
	public double calcularRenta(Renta r) {
		// TODO Auto-generated method stub
		return r.calcularCostoKmRecorridos();
	}

}
