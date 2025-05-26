package ar.edu.unlp.info.oo2.sueldos;

public class EmpleadoPlanta extends Empleado {
	
		private double basico = 50000;
		private int antiguedad;
		private double unidadPorAntiguedad = 2000;
		
		
		public EmpleadoPlanta (int ant, boolean casado, int hijos) {
			this.setBasico(this.basico);
			this.antiguedad = ant;
			this.setCantidadHijos(hijos);
			this.setEsCasado(casado);
		}
		
		public double definirAdicionales() {
			return super.definirAdicionales() + (this.antiguedad * this.unidadPorAntiguedad);
		}
}
