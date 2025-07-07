package segundoCambio;

import org.w3c.dom.Document;

public class XLSReport extends ReportGenerator {

	@Override
	public void configurarContenido(DocumentFile df, Document doc) {
		// TODO Auto-generated method stub
		docFile.contentType("application/vnd.ms-excel");
		docFile.setSheetName(document.getSubtitle());
	}

	@Override
	public void exportarContenido(DocumentFile df, Document doc) {
		// TODO Auto-generated method stub
		ExcelWriter writer = new ExcelWriter();
		byte[] content = writer.generateExcelFile(document);
		docFile.setContent(content);
	}

}
