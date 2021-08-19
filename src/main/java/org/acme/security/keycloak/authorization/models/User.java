package org.acme.security.keycloak.authorization.models;

import java.io.Serializable;

import io.quarkus.security.identity.SecurityIdentity;

public class User implements Serializable {
    private static final long serialVersionUID = 300267651952566888L;

    private final String userName;

    public User(SecurityIdentity securityContext) {
        this.userName = securityContext.getPrincipal().getName();
    }

    public String getUserName() {
        return userName;
    }
}
