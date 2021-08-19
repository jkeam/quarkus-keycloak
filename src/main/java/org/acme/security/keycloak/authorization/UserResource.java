package org.acme.security.keycloak.authorization;

import org.eclipse.microprofile.jwt.JsonWebToken;
import javax.inject.Inject;
import javax.annotation.security.RolesAllowed;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.jboss.resteasy.annotations.cache.NoCache;
import io.quarkus.security.identity.SecurityIdentity;
import org.acme.security.keycloak.authorization.models.User;

@Path("/api/users")
public class UserResource {

    @Inject
    SecurityIdentity keycloakSecurityContext;

    @Inject
    JsonWebToken jwt;

    @GET
    @Path("/me")
    @Produces(MediaType.APPLICATION_JSON)
    @NoCache
    public User me() {
        return new User(keycloakSecurityContext);
    }

}
