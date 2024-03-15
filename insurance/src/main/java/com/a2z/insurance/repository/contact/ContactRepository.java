package com.a2z.insurance.repository.contact;


import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.a2z.insurance.model.contact.Contact;
@Repository
public interface ContactRepository extends MongoRepository<Contact, String> {
	Contact getContactByContactNumber(String contactNumber);

}
