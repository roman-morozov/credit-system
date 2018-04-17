package by.pdu.creditsystem.entity;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

import javax.persistence.Entity;

@Entity(name = "Individual")
@Data
@EqualsAndHashCode(callSuper = true)
@ToString(callSuper = true)
public class Individual extends Client {
    private Name name;
    private Passport passport;
}
