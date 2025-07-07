package segundoCambio;

import org.w3c.dom.Document;

public class PDFReport extends ReportGenerator {

	@Override
	public void configurarContenido(DocumentFile df, Document doc) {
		// TODO Auto-generated method stub
		docFile.contentType("application/pdf");
		docFile.setPageSize("A4");
	}

	@Override
	public void exportarContenido(DocumentFile df, Document doc) {
		// TODO Auto-generated method stub
		PDFExporter exporter = new PDFExporter();
		byte[] content = exporter.generatePDFFile(document);
		docFile.setContent(content);
	}

}
