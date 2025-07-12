package segundoCambio;

public class TipoBasica implements ITipo {

	@Override
	public double calcularRenta(Renta r) {
		// TODO Auto-generated method stub
		return (r.calcularKmDias() + r.calcularCostoKmRecorridos()) * r.calcularAdicional();
	}

}
