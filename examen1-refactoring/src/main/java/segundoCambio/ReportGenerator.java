package segundoCambio;

import org.w3c.dom.Document;

public abstract class ReportGenerator {

	/*
	 *Bad Smell siguiente -> las subclases realizan pasos similares en un orden idéntico en generateReport, solo cambia la lógica interna de los pasos.
- Duplicated Code: en método "generateReport" de ambas subclases. Se realiza "Form Template Method" para unificar el comportamiento en los puntos similares:
Extraigo métodos cómo "configurarContenido()" con las lineas 15-16 de cada subclase.
Extraigo métodos como "exportarContenido()" con las lineas 18-20 de cada subclase.
Realizo Pull-up method de partes idénticas de ambos métodos a su superclase: lineas 10-11, 13 y 22. Con esto redefino el método generateReport como concreto, manteniendo los pasos de las subclases.
Redefino los métodos configurarContenido y exportarContenido como métodos abstractos en superclase. y los utilizo en el método generateReport.
Modifico las clases en los tests para su prueba.
 
	  */
	public void generateReport(Document document) {
		
		DocumentFile docFile = new DocumentFile();
		docFile.setTitle(document.getTitle());
		docFile.setAuthors(this.definirAutores(document));
		
		this.configurarContenido(docFile, document);
		
		this.exportarContenido(docFile, document);
		
		this.saveExportedFile(docFile);
	}
	
	public String definirAutores(Document document) {
		String authors = "";
		for (String author: document.getAuthors()) {
			authors += ", " + author;
		}
		return authors;
	}
	
	public abstract void configurarContenido(DocumentFile df, Document doc);
	public abstract void exportarContenido(DocumentFile df, Document doc);
	
}
