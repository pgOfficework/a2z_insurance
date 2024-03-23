package com.a2z.insurance.model.contact;

import java.util.Set;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
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
	private String contactId;
	private long contactNumber;
	private String firstName;
	private String middleName;
	private int title;
	private int genderId;
	private int nationalityId;
	private int birthCountryId;
	private String lastName;
	private String dateOfBirth;

	@OneToMany(targetEntity = ContactBankAccounts.class,cascade = CascadeType.ALL)
	@JoinColumn(name = "contactNumber", referencedColumnName = "contactNumber")
	private Set<ContactBankAccounts> bankAccounts;

	@OneToMany(targetEntity = Emails.class,cascade = CascadeType.ALL)
	@JoinColumn(name = "contactNumber", referencedColumnName = "contactNumber")
	private Set<Emails> emails;

	@OneToMany(targetEntity = TelephonesNumbers.class,cascade = CascadeType.ALL)
	@JoinColumn(name = "contactNumber", referencedColumnName = "contactNumber")
	private Set<TelephonesNumbers> telephoneNumbers;

}
