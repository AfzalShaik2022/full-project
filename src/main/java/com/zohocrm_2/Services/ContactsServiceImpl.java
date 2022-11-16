package com.zohocrm_2.Services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zohocrm_2.Repositories.ContactsRepository;
import com.zohocrm_2.entities.Contact;
@Service
public class ContactsServiceImpl implements ContactsService {
	@Autowired
	private ContactsRepository contactsRepo;
	@Override
	public void saveOneContact(Contact contacts) {
			contactsRepo.save(contacts);
	}
	@Override
	public List<Contact> getAllContacts() {
		List<Contact> contacts = contactsRepo.findAll();
		return contacts;
	}
	@Override
	public Contact getOneContact(long id) {
		Optional<Contact> findById = contactsRepo.findById(id);
		Contact contact = findById.get();
		return contact;
		}
		
	}


