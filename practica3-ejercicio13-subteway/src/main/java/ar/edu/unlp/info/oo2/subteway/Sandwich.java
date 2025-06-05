package ar.edu.unlp.info.oo2.subteway;

public class Sandwich {

	private String pan;
	private Integer precioPan;
	private String aderezo;
	private Integer precioAderezo;
	private String principal;
	private Integer precioPrincipal;
	private String adicional;
	private Integer precioAdicional;
	
	public double getPrecioTotal() {
		return this.getPrecioPan() + this.getPrecioAderezo() + this.getPrecioPrincipal() + this.getPrecioAdicional();
	}
	
	public String getPan() {
		return pan;
	}
	public void setPan(String pan) {
		this.pan = pan;
	}
	public Integer getPrecioPan() {
		return precioPan;
	}
	public void setPrecioPan(Integer precioPan) {
		this.precioPan = precioPan;
	}
	public String getAderezo() {
		return aderezo;
	}
	public void setAderezo(String aderezo) {
		this.aderezo = aderezo;
	}
	public Integer getPrecioAderezo() {
		return precioAderezo;
	}
	public void setPrecioAderezo(Integer precioAderezo) {
		this.precioAderezo = precioAderezo;
	}
	public String getPrincipal() {
		return principal;
	}
	public void setPrincipal(String principal) {
		this.principal = principal;
	}
	public Integer getPrecioPrincipal() {
		return precioPrincipal;
	}
	public void setPrecioPrincipal(Integer precioPrincipal) {
		this.precioPrincipal = precioPrincipal;
	}
	public String getAdicional() {
		return adicional;
	}
	public void setAdicional(String adicional) {
		this.adicional = adicional;
	}
	public Integer getPrecioAdicional() {
		return precioAdicional;
	}
	public void setPrecioAdicional(Integer precioAdicional) {
		this.precioAdicional = precioAdicional;
	}
}
