package by.pdu.creditsystem.entity;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

import javax.persistence.Entity;

@Entity(name = "LegalEntity")
@Data
@EqualsAndHashCode(callSuper = true)
@ToString(callSuper = true)
public class LegalEntity extends Client {
    private String name;
    private String propertyType;
}
