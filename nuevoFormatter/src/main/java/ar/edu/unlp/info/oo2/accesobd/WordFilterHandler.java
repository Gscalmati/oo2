package ar.edu.unlp.info.oo2.accesobd;

import java.util.List;
import java.util.logging.Handler;
import java.util.logging.LogRecord;

public class WordFilterHandler extends Handler {

	private Handler delegateHandler;
	private List<String> wordsToFilter;
	
	public WordFilterHandler(Handler handler, List<String> words) {
		this.delegateHandler = handler;
		this.wordsToFilter = words;
	}
	
	@Override
	public void publish(LogRecord record) {
		// TODO Auto-generated method stub
		if (!isLoggable(record)) return;
		
		
		
		String message = record.getMessage();
		
		 for (String palabra : wordsToFilter) {
			 message = message.replaceAll("\\b" + palabra + "\\b", "***");
	        }

	        // Crear un nuevo LogRecord con el mensaje filtrado
	        LogRecord nuevoRecord = new LogRecord(record.getLevel(), message);
	        nuevoRecord.setLoggerName(record.getLoggerName());
	        nuevoRecord.setMillis(record.getMillis());
	        nuevoRecord.setParameters(record.getParameters());
	        nuevoRecord.setResourceBundle(record.getResourceBundle());
	        nuevoRecord.setResourceBundleName(record.getResourceBundleName());
	        nuevoRecord.setSequenceNumber(record.getSequenceNumber());
	        nuevoRecord.setSourceClassName(record.getSourceClassName());
	        nuevoRecord.setSourceMethodName(record.getSourceMethodName());
	        nuevoRecord.setThreadID(record.getThreadID());

	        // Delegar el log al handler real (ej. ConsoleHandler)
	        delegateHandler.publish(nuevoRecord);
		
	}

	@Override
	public void flush() {
		// TODO Auto-generated method stub
		delegateHandler.flush();
	}

	@Override
	public void close() throws SecurityException {
		// TODO Auto-generated method stub
		delegateHandler.close();
	}

}
