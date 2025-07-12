package ar.edu.unlp.info.oo2.accesobd;

import java.util.logging.ConsoleHandler;
import java.util.logging.Logger;

public class TestHandlers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Logger logger = Logger.getLogger("MyLogger");

	        // Crear un handler de consola
	        ConsoleHandler handler = new ConsoleHandler();

	        // Aquí puedes elegir qué formatter usar:
	        // handler.setFormatter(new UpperCaseFormatter());
	        handler.setFormatter(new UppercaseFormatter());

	        // Quitar handlers por defecto para que no duplique la salida
	        logger.setUseParentHandlers(false);
	        logger.addHandler(handler);

	        logger.info("Logging with json");
	        logger.warning("Este es un mensaje de advertencia");
	        System.out.println("Fin");
	}

}
