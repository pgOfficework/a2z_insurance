package com.a2z.insurance.model.contact;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity(name = "country")
public class Country {
    @Id
    private int code;
    private String country;

}
