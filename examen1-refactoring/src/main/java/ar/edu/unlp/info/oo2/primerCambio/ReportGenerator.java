package ar.edu.unlp.info.oo2.primerCambio;

import org.w3c.dom.Document;

public abstract class ReportGenerator {
	
	/*1 
	 * Enumerar Code Smells

- Long Method: método generateReport
- Primitive obession: uso de Tipo como string
- Switch/If conditional: Lineas 6-24, y  25 a 44 
- Duplicated Code: Lineas 10 a 14, y 30 a 34

2

- Duplicated Code: Realizo un EXTRACT METHOD de las lineas 10 a 14, llamandolo "definirAutores" colocando como parámetro el Document. Una vez extraído, sustituyo las lineas 30 a 34 con el mismo pedido al nuevo método.

- Primitive Obession y Switch: Realizo un "Replace Type Code with Subclasses" para separar el uso del condicional y definir cada comportamiento respectivamente, de esta forma elimino el uso de la variable "tipo", redefino la clase ReportGenerator como una clase abstracta, y creo 2 clases llamadas "PDFReport" y "XLSReport", asigno el comportamiento de la linea 6-24 en el método homónimo de la primera, y el código de la 25-44 a la segunda. Elimino el constructor de la clase abstracta.
*/

	public abstract void generateReport(Document document);
	
	public String definirAutores(Document document) {
		String authors = "";
		for (String author: document.getAuthors()) {
			authors += ", " + author;
		}
		return authors;
	}
	
	
}
