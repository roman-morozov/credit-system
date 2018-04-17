package by.pdu.creditsystem.entity;

import lombok.Data;

import javax.persistence.Embeddable;
import java.io.Serializable;

@Embeddable
@Data
public class Name implements Serializable {
    private String first;
    private String middle;
    private String last;
}
