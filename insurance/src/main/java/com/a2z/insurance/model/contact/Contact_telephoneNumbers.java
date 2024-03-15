package com.a2z.insurance.model.contact;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Contact_telephoneNumbers {
	private Contact_telephoneNumbers_countryDialCode countryDialCode;

	private Integer id;

	private String telephoneNumber;

	private String telephonePrefix;

	private Contact_telephoneNumbers_telephoneType telephoneType;

	// Standard getters & setters
	public Contact_telephoneNumbers_countryDialCode getCountryDialCode() {
		return countryDialCode;
	}

	public void setCountryDialCode(Contact_telephoneNumbers_countryDialCode countryDialCode) {
		this.countryDialCode = countryDialCode;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getTelephoneNumber() {
		return telephoneNumber;
	}

	public void setTelephoneNumber(String telephoneNumber) {
		this.telephoneNumber = telephoneNumber;
	}

	public String getTelephonePrefix() {
		return telephonePrefix;
	}

	public void setTelephonePrefix(String telephonePrefix) {
		this.telephonePrefix = telephonePrefix;
	}

	public Contact_telephoneNumbers_telephoneType getTelephoneType() {
		return telephoneType;
	}

	public void setTelephoneType(Contact_telephoneNumbers_telephoneType telephoneType) {
		this.telephoneType = telephoneType;
	}
}
