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
