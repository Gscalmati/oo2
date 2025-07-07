package ar.edu.unlp.info.oo2.primerCambio;

import org.w3c.dom.Document;

public class PDFReport extends ReportGenerator {

	@Override
	public void generateReport(Document document) {
		// TODO Auto-generated method stub
		DocumentFile docFile = new DocumentFile();
		docFile.setTitle(document.getTitle());
		
		docFile.setAuthors(this.definirAutores(document));
		
		docFile.contentType("application/pdf");
		docFile.setPageSize("A4");
		
		PDFExporter exporter = new PDFExporter();
		byte[] content = exporter.generatePDFFile(document);
		docFile.setContent(content);
		
		this.saveExportedFile(docFile);
		
	}

}
