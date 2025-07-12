package ar.edu.unlp.info.oo2.accesobd;

import java.util.logging.Formatter;
import java.util.logging.LogRecord;

public class JSONFormatter extends Formatter {

	@Override
	public String format(LogRecord record) {
		// TODO Auto-generated method stub
		String message = record.getMessage();
        String level = record.getLevel().toString().toLowerCase();
        return String.format("{ \"message\": \"%s\", \"level\": \"%s\" }\n", message, level);

	}

}
