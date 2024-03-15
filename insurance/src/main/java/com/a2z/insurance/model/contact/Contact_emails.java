package com.a2z.insurance.model.contact;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Contact_emails {
	private String email;

	private Contact_emails_emailType emailType;

	private Integer id;

	// Standard getters & setters
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Contact_emails_emailType getEmailType() {
		return emailType;
	}

	public void setEmailType(Contact_emails_emailType emailType) {
		this.emailType = emailType;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}
}
