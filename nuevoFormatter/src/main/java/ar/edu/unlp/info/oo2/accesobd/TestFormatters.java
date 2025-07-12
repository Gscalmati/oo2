package ar.edu.unlp.info.oo2.accesobd;

import java.util.Arrays;
import java.util.logging.ConsoleHandler;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

public class TestFormatters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Logger logger = Logger.getLogger("WordFilterLogger");

	        // Crear handler de consola con un formatter
	        ConsoleHandler consoleHandler = new ConsoleHandler();
	        consoleHandler.setFormatter(new UppercaseFormatter());

	        // Crear el filtro con una lista de palabras
	        WordFilterHandler filtroHandler = new WordFilterHandler(consoleHandler, Arrays.asList("switch-statements", "danger"));
	        
	        EmailHandler emailHandler = new EmailHandler(filtroHandler);

	        logger.setUseParentHandlers(false); // Para evitar salida duplicada
	        logger.addHandler(emailHandler);

	        logger.info("I love switch-statements");
	        logger.warning("This might be danger for the system");
	    }
}
