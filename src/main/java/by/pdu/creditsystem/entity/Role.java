package by.pdu.creditsystem.entity;

import org.springframework.security.core.GrantedAuthority;

public enum Role implements GrantedAuthority {
    ADMIN, MANAGER, OPERATOR;

    @Override
    public String getAuthority() {
        return "ROLE_" + toString();
    }
}
