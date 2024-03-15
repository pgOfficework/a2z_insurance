package com.a2z.insurance.model.contact;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Contact_bankAccounts {
	private String accountNumberLastDigits;

	private String bankName;

	private Contact_bankAccounts_country country;

	// Standard getters & setters
	public String getAccountNumberLastDigits() {
		return accountNumberLastDigits;
	}

	public void setAccountNumberLastDigits(String accountNumberLastDigits) {
		this.accountNumberLastDigits = accountNumberLastDigits;
	}

	public String getBankName() {
		return bankName;
	}

	public void setBankName(String bankName) {
		this.bankName = bankName;
	}

	public Contact_bankAccounts_country getCountry() {
		return country;
	}

	public void setCountry(Contact_bankAccounts_country country) {
		this.country = country;
	}
}
