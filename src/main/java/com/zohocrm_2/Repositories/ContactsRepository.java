package com.zohocrm_2.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.zohocrm_2.entities.Contact;

public interface ContactsRepository extends JpaRepository<Contact, Long> {

}
