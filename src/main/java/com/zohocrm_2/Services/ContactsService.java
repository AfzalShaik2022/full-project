package com.zohocrm_2.Services;

import java.util.List;

import com.zohocrm_2.entities.Contact;

public interface ContactsService {
	public void saveOneContact(Contact contacts);

	public List<Contact> getAllContacts();

	public Contact getOneContact(long id);
}
