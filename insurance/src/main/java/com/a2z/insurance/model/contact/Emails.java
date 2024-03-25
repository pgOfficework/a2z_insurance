package com.a2z.insurance.model.contact;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import jakarta.persistence.ConstraintMode;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import lombok.Data;

@Data
@JsonIgnoreProperties(value = { "id" })
@Entity(name = "emails")
public class Emails {
    @Id
    private long id;
    private long contactNumber;
    private int type;
    private String email;

    @OneToOne
    @JoinColumn(name = "type", referencedColumnName = "id", insertable = false, updatable = false, foreignKey = @jakarta.persistence.ForeignKey(value = ConstraintMode.NO_CONSTRAINT))
    private Type emailType;
}
