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
import org.springframework.beans.factory.annotation.Value;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

@Service
public class Email {

	//@Autowired
	//private JavaMailSender mailSender;

	@Value("${spring.mail.username}")
	private String username;

	@Value("${spring.mail.password}")
	private String password;

	public boolean sendEmailMime(String userMail, String userId) {

		String url = "https://www.unenucheckmap.com/registrierung/" + userId;
		String content = "<a href='" + url + "'>Registrierung abschließen</a>";

		Properties prop = new Properties();
		prop.put("mail.smtp.host", "smtp.gmail.com");
		prop.put("mail.smtp.port", "587");
		prop.put("mail.smtp.auth", "true");
		prop.put("mail.smtp.starttls.enable", "true");

		Session session = Session.getInstance(prop, new javax.mail.Authenticator() {
			protected PasswordAuthentication getPasswordAuthentication() {
				return new PasswordAuthentication(username, password);
			}
		});

		try {

			Message message = new MimeMessage(session);
			message.setFrom(new InternetAddress("info@unenu.de"));
			message.setRecipients(Message.RecipientType.TO, InternetAddress.parse(userMail));
			message.setSubject("Registrierung abschließen");

			message.setSentDate(new Date());
		
			message.setContent(
					"<img width=\"50\" height=\"50\" style=\"width:50px;height:50px\" alt='Logo Share' src='https://firebasestorage.googleapis.com/v0/b/sharing-c83d9.appspot.com/o/logo%2FWORLD.png?alt=media&token=97996d9c-bfbb-4dcd-99a1-469e46fb0472' />\n\n\n<h1>Registrierung SHARE bestätigen</h1>\n\nVielen Dank, das Sie sich für die Registrierung bei SHARE entschieden haben.\nSchließen Sie Ihre Registrieung ab, indem Sie auf folgenden Link klicken.\n\n"
							+ content,
					"text/html;charset=UTF-8");

			Transport.send(message);

			return true;

		} catch (MessagingException e) {
			e.printStackTrace();
			return false;
		}
	}

}
