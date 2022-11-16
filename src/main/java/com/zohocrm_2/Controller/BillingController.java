package com.zohocrm_2.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.zohocrm_2.Services.BillingService;
import com.zohocrm_2.Services.ContactsService;
import com.zohocrm_2.entities.Billing;
import com.zohocrm_2.entities.Contact;

@Controller
public class BillingController {
	@Autowired
	private BillingService billingService;
	@Autowired
	private ContactsService contactsService;
	@RequestMapping("/generateBill")
	public String getContactId(@RequestParam("id")long id,ModelMap model) {
		 Contact contact=contactsService.getOneContact(id);
		 model.addAttribute("contact", contact);
		return "generate_bill";
	}
	@RequestMapping("/saveBill")
	public String saveBill(@ModelAttribute("bill")Billing bill) {
		billingService.SaveBill(bill);
		return"generate_bill";
		
	}
}
