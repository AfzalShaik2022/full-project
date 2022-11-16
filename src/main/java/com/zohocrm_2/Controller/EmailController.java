package com.zohocrm_2.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.zohocrm_2.Utilities.EmailService;

@Controller
public class EmailController {
	@Autowired
	private EmailService emailService;
	@RequestMapping("/sendEmail")
	public String sendEmail(@RequestParam("to")String to , @RequestParam("subject")String subject, @RequestParam("emailBody")String emailBody) {
		emailService.sendEmail(to, subject, emailBody);
		return "compose_email";
	}
	
}
