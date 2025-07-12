package ar.edu.unlp.info.oo2.accesobd;

import java.util.List;
import java.util.Properties;
import java.util.logging.Handler;
import java.util.logging.LogRecord;

import jakarta.mail.Authenticator;
import jakarta.mail.Message;
import jakarta.mail.PasswordAuthentication;
import jakarta.mail.Session;
import jakarta.mail.Transport;
import jakarta.mail.internet.InternetAddress;
import jakarta.mail.internet.MimeMessage;

public class EmailHandler extends Handler {

	private Handler delegateHandler;
	
	public EmailHandler(Handler handler) {
		this.delegateHandler = handler;
	}
	
	@Override
	public void publish(LogRecord record) {
		// TODO Auto-generated method stub
		if (!isLoggable(record)) return;
		
		
		this.sendEmail(record.getMessage());
	
	        // Delegar el log al handler real (ej. ConsoleHandler)
	        delegateHandler.publish(record);
		
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

	private void sendEmail (String text) {
		try {
			String from = "example@logger.com";
			String to = "destination@mail.com";

			// credenciales
			String username = "2310c050a5b203"; // Completar con su username de mailtrap
			String password = "c4867bd86b1158"; // Completar con su password de mailtrap
			
			Properties props = new Properties();
			props.put("mail.smtp.auth", "true");
			props.put("mail.smtp.starttls.enable", "true");
			props.put("mail.smtp.host", "smtp.mailtrap.io");
			props.put("mail.smtp.port", "587");
			Session session = Session.getInstance(props,
				new Authenticator() {
		            protected PasswordAuthentication getPasswordAuthentication() {
		            	return new PasswordAuthentication(username, password);
		            }
			});

		    Message message = new MimeMessage(session);
		    message.setFrom(new InternetAddress(from, "Java logging mail"));
		    message.setRecipients(Message.RecipientType.TO, InternetAddress.parse(to));
		    message.setSubject("Envio test");
		    message.setText(text);
		    Transport.send(message);
		}
		catch (Exception e) {
			throw new RuntimeException(e);
	    }
	}
}
