package ar.edu.unlp.info.oo2.primerCambio;

import org.w3c.dom.Document;

public class XLSReport extends ReportGenerator {

	@Override
	public void generateReport(Document document) {
		// TODO Auto-generated method stub
		DocumentFile docFile = new DocumentFile();
		docFile.setTitle(document.getTitle());
		
		docFile.setAuthors(this.definirAutores(document));
		
		docFile.contentType("application/vnd.ms-excel");
		docFile.setSheetName(document.getSubtitle());
		
		ExcelWriter writer = new ExcelWriter();
		byte[] content = writer.generateExcelFile(document);
		docFile.setContent(content);
		
		this.saveExportedFile(docFile);
		
	}

}
