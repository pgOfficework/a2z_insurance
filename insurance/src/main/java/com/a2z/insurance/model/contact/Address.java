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
import lombok.ToString;

@NoArgsConstructor
@AllArgsConstructor
@ToString
@Setter
@Getter
@Entity(name = "addresses")
public class Address {
    @Id
    long id;
    long contact_number;
    String house;
    String street;
    String city;
    String postalCode;
    String district;
    String state_name;
    int type;

    @OneToOne
    @JoinColumn(name = "type", referencedColumnName = "id", insertable = false, updatable = false, foreignKey = @jakarta.persistence.ForeignKey(value = ConstraintMode.NO_CONSTRAINT))
    private Type addressType;
}
