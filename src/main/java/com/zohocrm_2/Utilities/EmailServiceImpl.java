package com.zohocrm_2.Utilities;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Component;

@Component
public class EmailServiceImpl implements EmailService {
	@Autowired
	JavaMailSender mailSender;
	@Override
	public void sendEmail(String to, String subject, String emailBody) {
			SimpleMailMessage mail= new SimpleMailMessage();
			mail.setTo(to);
			mail.setSubject(subject);
			mail.setText(emailBody);
			mailSender.send(mail);
	}

}
