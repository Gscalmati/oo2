package ar.edu.unlp.oo1.ejercicio1.app;

import java.io.IOException;

import java.util.logging.FileHandler;
import java.util.logging.Logger;
import java.util.logging.*;

import javax.swing.SwingUtilities;

import ar.edu.unlp.oo1.ejercicio1.ui.WallPostUI;

public class Ejercicio1Application {

	
	
	public static void main(String[] args) throws SecurityException, IOException {

		configurarLoggers();

        Logger vistaLogger = Logger.getLogger("ui"); // si segmentás por paquete o clase
        vistaLogger.log(Level.INFO, "Aplicación iniciada.");
		
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				new WallPostUI();
			}
		});
	}

	private static void configurarLoggers() {
		// TODO Auto-generated method stub
		 try {
			 // === Logger para POSTS (modelo - WallPostImpl) ===
		        Logger postsLogger = Logger.getLogger("posts");
		        postsLogger.setUseParentHandlers(false);
		        postsLogger.setLevel(Level.WARNING);

		        FileHandler fileHandler = new FileHandler("modelo.log", true); // append = true
		        fileHandler.setFormatter(new SimpleFormatter());
		        fileHandler.setLevel(Level.WARNING);
		        postsLogger.addHandler(fileHandler);

		        // === Logger para VISTAS (interfaz - WallPostUI) ===
		        Logger vistasLogger = Logger.getLogger("vistas");
		        vistasLogger.setUseParentHandlers(false);
		        vistasLogger.setLevel(Level.INFO);

		        ConsoleHandler consoleHandler = new ConsoleHandler();
		        consoleHandler.setFormatter(new SimpleFormatter());
		        consoleHandler.setLevel(Level.INFO);
		        vistasLogger.addHandler(consoleHandler);

		        // === Logger de la app (opcional) ===
		        Logger appLogger = Logger.getLogger("ui");
		        appLogger.setUseParentHandlers(false);
		        appLogger.setLevel(Level.INFO);

		        ConsoleHandler appConsole = new ConsoleHandler();
		        appConsole.setFormatter(new SimpleFormatter());
		        appConsole.setLevel(Level.INFO);
		        appLogger.addHandler(appConsole);

	        } catch (IOException e) {
	            e.printStackTrace();
	        }
	    }

}
