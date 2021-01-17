package ch.carve;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import org.eclipse.microprofile.config.inject.ConfigProperty;

/**
 * Sample resource
 */
@Path("sample")
public class SampleResource {

    @Inject
    @ConfigProperty(name = "message")
    String message;

    @GET
    public String ping() {
        return message + " Wildfly bootable JAR dev mode";
    }

}
