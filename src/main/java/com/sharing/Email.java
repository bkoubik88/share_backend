package com.sharing;

import java.util.Date;
import java.util.Properties;

import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

@Service
public class Email {

	@Autowired
	private JavaMailSender mailSender;

	public boolean sendEmail(String userMail) throws MessagingException {

		try {
			SimpleMailMessage message = new SimpleMailMessage();
			message.setFrom("info@unenu.de");
			message.setTo(userMail);
			message.setText("Test");
			message.setSubject("HUHU");

			mailSender.send(message);

			return true;
		}

		// Catch block to handle the exceptions
		catch (Exception e) {
			e.printStackTrace();
			return false;
		}

	}

	public boolean sendEmailMime(String userMail, String userId) {

		String url = "https://unenumapcheck.herokuapp.com/Registrierung/" + userId;
		String content = "<a href='" + url + "'>Registrierung abschließen</a>";

		Properties prop = new Properties();
		prop.put("mail.smtp.host", "smtp.gmail.com");
		prop.put("mail.smtp.port", "587");
		prop.put("mail.smtp.auth", "true");
		prop.put("mail.smtp.starttls.enable", "true"); // TLS

		Session session = Session.getInstance(prop, new javax.mail.Authenticator() {
			protected PasswordAuthentication getPasswordAuthentication() {
				return new PasswordAuthentication("sharingunenu@gmail.com", "qcmxmejrnedflcve");
			}
		});

		try {

			Message message = new MimeMessage(session);
			message.setFrom(new InternetAddress("info@unenu.de"));
			message.setRecipients(Message.RecipientType.TO, InternetAddress.parse(userMail));
			message.setSubject("Registrierung abschließen");
			message.setText(
					"Vielen Dank, das Sie sich für die Registration bei SHARE entschieden haben.\nSchließen Sie Ihre Registrieung ab, indem Sie auf folgenden Link klicken.\n\n"
							+ content);
			message.setSentDate(new Date());
			// Send the actual HTML message, as big as you like
			message.setContent(
					"<h1>Registrierung SHARE bestätigen</h1>\n\nVielen Dank, das Sie sich für die Registrierung bei SHARE entschieden haben.\nSchließen Sie Ihre Registrieung ab, indem Sie auf folgenden Link klicken.\n\n"
							+ content,
					"text/html,UTF-8");

			Transport.send(message);

			return true;

		} catch (MessagingException e) {
			e.printStackTrace();
			return false;
		}
	}

}
