package by.pdu.creditsystem.entity;

import lombok.Data;

import javax.persistence.Embeddable;
import java.io.Serializable;

@Embeddable
@Data
public class Passport implements Serializable {
    private String series;
    private String number;
}
