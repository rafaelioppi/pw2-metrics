package dev.pw2;

import io.micrometer.core.annotation.Counted;
import io.micrometer.core.annotation.Timed;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@Path("/itens")
public class ItemResource {

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    @Counted(
        value = "itemResourceCounter",
        description = "Counts how many times the /itens endpoint has been called."
    )
    @Timed(
        value = "itemResourceTimer",
        description = "Times how long it takes to process the /itens endpoint."
    )
    
    public String hello() {
        return "Hello from Quarkus REST";
    }
}