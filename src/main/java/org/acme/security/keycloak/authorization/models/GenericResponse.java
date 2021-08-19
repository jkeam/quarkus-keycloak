package org.acme.security.keycloak.authorization.models;

import java.io.Serializable;

public class GenericResponse implements Serializable {
    private static final long serialVersionUID = -6359495610551697413L;
    private final String type;

    public GenericResponse(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }
}
