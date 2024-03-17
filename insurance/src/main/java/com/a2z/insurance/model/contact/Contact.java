package com.a2z.insurance.model.contact;



import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Contact {
	
	@Id
	long id;
	private String fullName;
	private String contactId;
	private String contactNumber;
	private String firstName;
	private String middleName;
	private String lastName;
	private String dateOfBirth;

	@Column(name = "_id")
	public long get_id() {
		return id;
	}
	
	@Column(name = "_id")
	public void setId(long id) {
		this.id = id;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
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

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getMiddleName() {
		return middleName;
	}

	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(String dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public Contact() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Contact [id=" + id + ", fullName=" + fullName + ", contactId=" + contactId + ", contactNumber="
				+ contactNumber + ", firstName=" + firstName + ", middleName=" + middleName + ", lastName=" + lastName
				+ ", dateOfBirth=" + dateOfBirth + "]";
	}

	

	public Contact(long id, String fullName, String contactId, String contactNumber, String firstName,
			String middleName, String lastName, String dateOfBirth) {
		this.id = id;
		this.fullName = fullName;
		this.contactId = contactId;
		this.contactNumber = contactNumber;
		this.firstName = firstName;
		this.middleName = middleName;
		this.lastName = lastName;
		this.dateOfBirth = dateOfBirth;
	}

}
