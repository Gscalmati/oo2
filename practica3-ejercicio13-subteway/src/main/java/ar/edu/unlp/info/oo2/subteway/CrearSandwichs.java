package ar.edu.unlp.info.oo2.subteway;

public class CrearSandwichs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SubteWay subteway = new SubteWay();
		subteway.cambiarConstructor(new Clasico());
		Sandwich clasico = subteway.crearSanguche();
		System.out.println(clasico.getPrecioTotal());
		
		subteway.cambiarConstructor(new Vegetariano());
		Sandwich vegetariano = subteway.crearSanguche();
		System.out.println(vegetariano.getPrecioTotal());
		
		subteway.cambiarConstructor(new Vegano());
		Sandwich vegano = subteway.crearSanguche();
		System.out.println(vegano.getPrecioTotal());
		
		subteway.cambiarConstructor(new SinTacc());
		Sandwich sintacc = subteway.crearSanguche();
		System.out.println(sintacc.getPrecioTotal());
	}

}
