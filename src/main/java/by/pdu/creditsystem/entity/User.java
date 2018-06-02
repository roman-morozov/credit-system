package by.pdu.creditsystem.entity;

import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.Entity;
import java.util.Set;

@Entity
@Data
@EqualsAndHashCode(callSuper = true)
public class User extends AbstractEntity {
    private String username;
    private String password;
    private boolean enabled;
    private boolean accountNonExpired;
    private boolean accountNonLocked;
    private boolean credentialsNonExpired;
    private Name name;
    private Set<Role> roles;
}
