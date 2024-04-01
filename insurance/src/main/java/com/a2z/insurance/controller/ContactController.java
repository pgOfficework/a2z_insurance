package com.a2z.insurance.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.a2z.insurance.model.contact.Contact;
import com.a2z.insurance.service.contact.ContactService;

@CrossOrigin(origins = "*")
@RequestMapping("/contact")
@RestController
public class ContactController {

	@Autowired
	private ContactService contactService;
	
	@GetMapping(path = "/bycontactnumber/{contactNumber}")
	@ResponseBody
	private Object getContactByeContactNumber(@PathVariable("contactNumber") int contactNumber) {
		System.out.println("getContactByeContactNumber-"+contactNumber);
		return contactService.getContactByContactNumber(contactNumber);
	}
	
	@GetMapping(path = "/getallcontacts")
	@ResponseBody
	private List<Contact> getAllContacts() {
		System.out.println("getAllContacts");
		return contactService.getAllContacts();
	}
}
