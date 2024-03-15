package com.a2z.insurance.model.contact;

import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Contact_addresses {
	private Contact_addresses_addressType addressType;

	private String city;

	private Contact_addresses_country country;

	private String house;

	private Integer id;

	private String postalCode;

	private String street;

	// Standard getters & setters
	public Contact_addresses_addressType getAddressType() {
		return addressType;
	}

	public void setAddressType(Contact_addresses_addressType addressType) {
		this.addressType = addressType;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public Contact_addresses_country getCountry() {
		return country;
	}

	public void setCountry(Contact_addresses_country country) {
		this.country = country;
	}

	public String getHouse() {
		return house;
	}

	public void setHouse(String house) {
		this.house = house;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getPostalCode() {
		return postalCode;
	}

	public void setPostalCode(String postalCode) {
		this.postalCode = postalCode;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}
}
