package ar.edu.unlp.info.oo2.accesobd;

import java.util.logging.Formatter;
import java.util.logging.LogRecord;

public class UppercaseFormatter extends Formatter {

	@Override
	public String format(LogRecord record) {
		// TODO Auto-generated method stub
		return record.getMessage().toUpperCase() + "\n";
	}

}
