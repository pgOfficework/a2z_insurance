package com.a2z.insurance.service.contact;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.a2z.insurance.model.contact.Contact;
import com.a2z.insurance.repository.contact.ContactRepository;

@Service
public class ContactService{

	@Autowired
	private ContactRepository contactRepository;
	
	@Autowired(required=false)
	public ContactService(ContactRepository contactRepository) {
		this.contactRepository=contactRepository;
	}
	
	public Object getContactByContactNumber(int contactNumber) {
		System.out.println("contactNumber : "+contactNumber);
		return contactRepository.getContactByContactNumber(contactNumber);
	}

	public List<Contact> getAllContacts() {
		// TODO Auto-generated method stub
		return contactRepository.findAll();
	}
}
