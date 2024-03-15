package com.a2z.insurance.model.contact;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Contact_emails_emailType {
	private String email;

	private Integer id;

	// Standard getters & setters
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}
}
