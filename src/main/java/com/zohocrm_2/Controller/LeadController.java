package com.zohocrm_2.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.zohocrm_2.Services.ContactsService;
import com.zohocrm_2.Services.LeadService;
import com.zohocrm_2.entities.Contact;
import com.zohocrm_2.entities.Lead;

@Controller
public class LeadController {
	@Autowired
	private ContactsService contactsService;
	@Autowired
	private LeadService leadService;
	@RequestMapping("/viewLeadPageCrm")
	public String viewLeadPageCrm() {
		return "create_lead";
	}	@RequestMapping("/saveLead")
		public String saveLead(@ModelAttribute("lead")Lead lead,ModelMap model) {
		leadService.saveLead(lead);
		model.addAttribute("lead",lead);
			return"lead_info";
}	
	@RequestMapping("/composeEmail")
	public String composeEmail(@RequestParam("email")String email,ModelMap model) {
		model.addAttribute("email", email);
		
		return "compose_email";
		
	}@RequestMapping("/convertLead")
	public String ConvertOneLead(@RequestParam("id")long id,ModelMap model) {
		Lead lead=leadService.getOneLead(id);
		
		Contact contact = new Contact();
		contact.setFirstName(lead.getFirstName());
		contact.setLastName(lead.getLastName());
		contact.setEmail(lead.getEmail());
		contact.setMobile(lead.getMobile());
		contact.setSource(lead.getSource());//create contact service next
		
		contactsService.saveOneContact(contact);
		
		leadService.deleteOneLead(lead.getId());
		List<Contact>contacts =contactsService.getAllContacts();
		model.addAttribute("contacts", contacts);
		return "list_contacts";
			
		
		
	}
	@RequestMapping("/ListLeads")
	public String getAllLeads(ModelMap model) {
		List<Lead>leads=leadService.listLeads();
		model.addAttribute("leads", leads);
		return "list_leads";
	}
	@RequestMapping("/findLeadById")
	public String findOneLead(@RequestParam("id")long id,  ModelMap model) {
		Lead lead=leadService.getOneLead(id);
		
		model.addAttribute("lead",lead);
		return"lead_info";
	}
			
		
}

