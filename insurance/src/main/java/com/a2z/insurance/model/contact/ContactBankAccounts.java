package com.a2z.insurance.model.contact;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
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
    private String country;
    private String branchName;
    private String accountNumber;


}
