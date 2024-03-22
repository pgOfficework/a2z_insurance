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
@Entity(name="telephone_numbers")
public class TelephonesNumbers {
    @Id
    private int id;
    private int contactNumber;
    private long telephoneNumber;
    private int countryDialCode;
    private int telephoneNumberType;

     @OneToOne
    @JoinColumn(name = "telephoneNumberType", referencedColumnName = "id", insertable = false, updatable = false, foreignKey = @jakarta.persistence.ForeignKey(value = ConstraintMode.NO_CONSTRAINT))
    private Type type;
    
}
