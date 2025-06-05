package ar.edu.unlp.info.oo2.excursiones;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Excursion {
	
	protected String nombre;
	protected String puntoEncuentro;
	protected LocalDate fechaInicio;
	protected LocalDate fechaFin;
	protected Double costo;
	private Integer cupoMin;
	private Integer cupoMax;
	private Estado estado;
	private List<Usuario> inscriptos;
	private List<Usuario> listaEspera;
	
	
	public Excursion (String nom, String enc, LocalDate ini, LocalDate fin, Double costo, Integer min, Integer max) {
		this.nombre = nom;
		this.puntoEncuentro = enc;
		this.fechaInicio = ini;
		this.fechaFin = fin;
		this.costo = costo;
		this.cupoMin = min;
		this.cupoMax = max;
		this.inscriptos = new ArrayList<Usuario>();
		this.listaEspera = new ArrayList<Usuario>();
		this.estado = new EstadoProvisoria();
	}
	
	public void inscribir(Usuario unUsuario) {
		this.estado.inscribir(this, unUsuario);
	}
	
	public String obtenerInformacion() {
		return this.estado.obtenerInfo(this);
	}

	public void agregarUsuario(Usuario unUsuario) {
		// TODO Auto-generated method stub
		this.inscriptos.add(unUsuario);
		
	}

	public Integer getCupoMin() {
		// TODO Auto-generated method stub
		return this.cupoMin;
	}
	
	public Integer getCupoMax() {
		// TODO Auto-generated method stub
		return this.cupoMax;
	}

	public int cantidadInscriptos() {
		// TODO Auto-generated method stub
		return this.inscriptos.size();
	}

	public void setEstado(Estado nuevoEstado) {
		this.estado = nuevoEstado;
		
	}

	public Integer cuposLibres() {
		// TODO Auto-generated method stub
		return this.cupoMax - this.cantidadInscriptos();
	}
	
	public List<String> emailsInscriptos() {
		// TODO Auto-generated method stub
		return this.inscriptos.stream().map(u -> u.getEmail()).collect(Collectors.toList());
	}

	public void agregarUsuarioListaEspera(Usuario unUsuario) {
		// TODO Auto-generated method stub
		this.listaEspera.add(unUsuario);
		
	}

	public int cantidadListaEspera() {
		// TODO Auto-generated method stub
		return this.listaEspera.size();
	}
	
	
	
}
