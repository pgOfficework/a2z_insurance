package com.a2z.insurance.model.contact;

import java.util.Set;

import jakarta.persistence.CascadeType;
import jakarta.persistence.ConstraintMode;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
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

	@OneToOne
    @JoinColumn(name = "nationalityId", referencedColumnName = "code", insertable = false, updatable = false, foreignKey = @jakarta.persistence.ForeignKey(value = ConstraintMode.NO_CONSTRAINT))
    private Country nationality;

	@OneToOne
    @JoinColumn(name = "birthCountryId", referencedColumnName = "code", insertable = false, updatable = false, foreignKey = @jakarta.persistence.ForeignKey(value = ConstraintMode.NO_CONSTRAINT))
    private Country birthCountry;

	@OneToOne
    @JoinColumn(name = "genderId", referencedColumnName = "id", insertable = false, updatable = false, foreignKey = @jakarta.persistence.ForeignKey(value = ConstraintMode.NO_CONSTRAINT))
    private Gender gender;

	@OneToMany(targetEntity = BankAccounts.class,cascade = CascadeType.ALL)
	@JoinColumn(name = "contactNumber", referencedColumnName = "contactNumber")
	private Set<BankAccounts> bankAccounts;

	@OneToMany(targetEntity = Emails.class,cascade = CascadeType.ALL)
	@JoinColumn(name = "contactNumber", referencedColumnName = "contactNumber")
	private Set<Emails> emails;

	@OneToMany(targetEntity = TelephonesNumbers.class,cascade = CascadeType.ALL)
	@JoinColumn(name = "contactNumber", referencedColumnName = "contactNumber")
	private Set<TelephonesNumbers> telephoneNumbers;

	@OneToMany(targetEntity = TelephonesNumbers.class,cascade = CascadeType.ALL)
	@JoinColumn(name = "contactNumber", referencedColumnName = "contactNumber")
	private Set<Address> addresses;

}
