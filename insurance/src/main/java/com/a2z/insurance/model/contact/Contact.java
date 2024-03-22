package com.a2z.insurance.model.contact;

import java.util.Set;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@NoArgsConstructor
@AllArgsConstructor
@ToString
@Setter
@Getter
@Entity(name="contact")
public class Contact {
	
	@Id
	long id;
	private String fullName;
	private String contactId;
	private int contactNumber;
	private String firstName;
	private String middleName;
	private String lastName;
	private String dateOfBirth;

	@OneToMany(mappedBy = "contactNumber", cascade = CascadeType.ALL,fetch = FetchType.LAZY)
	private Set<ContactBankAccounts> bankAccounts;

	@OneToMany(mappedBy = "contactNumber", cascade = CascadeType.ALL,fetch = FetchType.LAZY)
	private Set<Emails> emails;

	@OneToMany(mappedBy = "contactNumber", cascade = CascadeType.ALL,fetch = FetchType.LAZY)
	private Set<TelephonesNumbers> telephoneNumbers;

}
