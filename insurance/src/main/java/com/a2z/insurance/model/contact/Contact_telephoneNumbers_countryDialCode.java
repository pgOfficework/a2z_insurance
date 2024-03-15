package com.a2z.insurance.model.contact;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Contact_telephoneNumbers_countryDialCode {
	private String id;

	// Standard getters & setters
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}
}
