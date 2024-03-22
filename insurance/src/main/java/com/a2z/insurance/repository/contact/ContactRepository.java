package com.a2z.insurance.repository.contact;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.a2z.insurance.model.contact.Contact;
@Repository
public interface ContactRepository extends JpaRepository<Contact, String> {
	Contact getContactByContactNumber(int contactNumber);
}
