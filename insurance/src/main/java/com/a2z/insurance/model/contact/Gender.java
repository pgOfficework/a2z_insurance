package com.a2z.insurance.model.contact;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@JsonIgnoreProperties(value = { "id" })
@Entity(name = "gender")
public class Gender {

    @Id
    private int id;
    private String description;

}
