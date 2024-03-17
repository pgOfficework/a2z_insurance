package com.a2z.insurance.model.contact;

<<<<<<< Updated upstream
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
=======
>>>>>>> Stashed changes

import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@Document
public class Contact {
	public Contact(Integer _id, Contact_addresses addresses, Contact_bankAccounts bankAccounts,
			Contact_birthCountry birthCountry, String contactId, @NotNull String contactNumber, String dateOfBirth,
			Contact_education education, Contact_emails emails, String firstName, String fullName,
			Contact_gender gender, String lastName, String middleName, Contact_nationality nationality,
			Contact_preferredContactMethod preferredContactMethod, Contact_profession profession,
			Contact_telephoneNumbers telephoneNumbers, Contact_title title) {
		super();
		this._id = _id;
		this.addresses = addresses;
		this.bankAccounts = bankAccounts;
		this.birthCountry = birthCountry;
		this.contactId = contactId;
		this.contactNumber = contactNumber;
		this.dateOfBirth = dateOfBirth;
		this.education = education;
		this.emails = emails;
		this.firstName = firstName;
		this.fullName = fullName;
		this.gender = gender;
		this.lastName = lastName;
		this.middleName = middleName;
		this.nationality = nationality;
		this.preferredContactMethod = preferredContactMethod;
		this.profession = profession;
		this.telephoneNumbers = telephoneNumbers;
		this.title = title;
	}

	@Id
	private Integer _id;

	private Contact_addresses addresses;

	private Contact_bankAccounts bankAccounts;

	private Contact_birthCountry birthCountry;

	private String contactId;
	
	@NotNull
	private String contactNumber;

	private String dateOfBirth;

	private Contact_education education;

	private Contact_emails emails;

	private String firstName;

	private String fullName;

	private Contact_gender gender;

	private String lastName;

	private String middleName;

	private Contact_nationality nationality;

	private Contact_preferredContactMethod preferredContactMethod;

	private Contact_profession profession;

	private Contact_telephoneNumbers telephoneNumbers;

	private Contact_title title;

	// Standard getters & setters
	public Integer getId() {
		return _id;
	}

	public void setId(Integer _id) {
		this._id = _id;
	}

	public Contact_addresses getAddresses() {
		return addresses;
	}

	public void setAddresses(Contact_addresses addresses) {
		this.addresses = addresses;
	}

	public Contact_bankAccounts getBankAccounts() {
		return bankAccounts;
	}

	public void setBankAccounts(Contact_bankAccounts bankAccounts) {
		this.bankAccounts = bankAccounts;
	}

	public Contact_birthCountry getBirthCountry() {
		return birthCountry;
	}

	public void setBirthCountry(Contact_birthCountry birthCountry) {
		this.birthCountry = birthCountry;
	}

	public String getContactId() {
		return contactId;
	}

	public void setContactId(String contactId) {
		this.contactId = contactId;
	}

	public String getContactNumber() {
		return contactNumber;
	}

	public void setContactNumber(String contactNumber) {
		this.contactNumber = contactNumber;
	}

	public String getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(String dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public Contact_education getEducation() {
		return education;
	}

	public void setEducation(Contact_education education) {
		this.education = education;
	}

	public Contact_emails getEmails() {
		return emails;
	}

	public void setEmails(Contact_emails emails) {
		this.emails = emails;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public Contact_gender getGender() {
		return gender;
	}

	public void setGender(Contact_gender gender) {
		this.gender = gender;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getMiddleName() {
		return middleName;
	}

	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}

	public Contact_nationality getNationality() {
		return nationality;
	}

	public void setNationality(Contact_nationality nationality) {
		this.nationality = nationality;
	}

	public Contact_preferredContactMethod getPreferredContactMethod() {
		return preferredContactMethod;
	}

	public void setPreferredContactMethod(Contact_preferredContactMethod preferredContactMethod) {
		this.preferredContactMethod = preferredContactMethod;
	}

	public Contact_profession getProfession() {
		return profession;
	}

	public void setProfession(Contact_profession profession) {
		this.profession = profession;
	}

	public Contact_telephoneNumbers getTelephoneNumbers() {
		return telephoneNumbers;
	}

	public void setTelephoneNumbers(Contact_telephoneNumbers telephoneNumbers) {
		this.telephoneNumbers = telephoneNumbers;
	}

	public Contact_title getTitle() {
		return title;
	}

	public void setTitle(Contact_title title) {
		this.title = title;
	}
}
