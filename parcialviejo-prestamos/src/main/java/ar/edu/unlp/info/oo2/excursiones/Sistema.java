package ar.edu.unlp.info.oo2.excursiones;

import java.util.ArrayList;
import java.util.List;

public class Sistema {
	private List<Cliente> clientes;
	private double tasa;
	
	public Sistema () {
		this.clientes = new ArrayList<Cliente>();
	}
	
	public void registrarCliente (String nom, double sueldo) {
		Cliente nue = new Cliente(nom, sueldo);
		this.clientes.add(nue);
	}
	
	public void solicitarPrestamoSimple (int cantCuotas, double monto, Cliente c) {
		Prestamo p = new PrestamoSimple(cantCuotas, monto, this.tasa);
		
		if (this.validarCuotaYSueldo(p.getCuota(), c.getSueldo())) {
			p.setEstado(new EstadoAprobado());
		} else {
			p.setEstado(new EstadoRechazado());
		}
	}
	
	public void solicitarPrestamoUva (int cantCuotas, double monto, Cliente c) {
		Prestamo p = new PrestamoUva(cantCuotas, monto);
		
		if (this.validarCuotaYSueldo(p.getCuota(), c.getSueldo())) {
			p.setEstado(new EstadoAprobado());
		} else {
			p.setEstado(new EstadoRechazado());
		}
	}

	private boolean validarCuotaYSueldo(double cuota, double sueldo) {
		// TODO Auto-generated method stub
		double valorMax = (30 * sueldo) / 100;
		return (cuota <= valorMax) ? true : false;
	}
}
