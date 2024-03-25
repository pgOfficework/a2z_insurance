package com.a2z.insurance.model.contact;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import jakarta.persistence.ConstraintMode;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import lombok.Data;

@Data
@JsonIgnoreProperties(value = { "id", "type" })
@Entity(name = "addresses")
public class Address {
    @Id
    private long id;
    private long contact_number;
    private String house;
    private String street;
    private String city;
    private String postalCode;
    private String district;
    private String state_name;
    private int type;

    @OneToOne
    @JoinColumn(name = "type", referencedColumnName = "id", insertable = false, updatable = false, foreignKey = @jakarta.persistence.ForeignKey(value = ConstraintMode.NO_CONSTRAINT))
    private Type addressType;
}
