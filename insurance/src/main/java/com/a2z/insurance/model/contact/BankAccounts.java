package com.a2z.insurance.model.contact;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import jakarta.persistence.ConstraintMode;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import lombok.Data;

@Data
@JsonIgnoreProperties(value = { "id", "countryCode" })
@Entity(name = "bank_accounts")
public class BankAccounts {
    @Id
    private int id;
    private long contactNumber;
    private String bankName;
    private int countryCode;
    private String branchName;
    private String accountNumber;

    @OneToOne
    @JoinColumn(name = "countryCode", referencedColumnName = "code", insertable = false, updatable = false, foreignKey = @jakarta.persistence.ForeignKey(value = ConstraintMode.NO_CONSTRAINT))
    private Country country;
}
