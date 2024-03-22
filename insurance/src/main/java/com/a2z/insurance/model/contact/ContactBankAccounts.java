package com.a2z.insurance.model.contact;

import jakarta.persistence.ConstraintMode;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
@Entity(name="bank_accounts")
public class ContactBankAccounts {
    @Id
    private int id;
    private int contactNumber;
    private String bankName;
    private int countryCode;
    private String branchName;
    private String accountNumber;

     @OneToOne
    @JoinColumn(name = "countryCode", referencedColumnName = "code", insertable = false, updatable = false, foreignKey = @jakarta.persistence.ForeignKey(value = ConstraintMode.NO_CONSTRAINT))
    private Country country;


}
