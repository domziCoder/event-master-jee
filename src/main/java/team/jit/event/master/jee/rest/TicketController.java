package team.jit.event.master.jee.rest;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("ticket")
@Produces(MediaType.APPLICATION_JSON)
public class TicketController {

    @GET
    @Path("/ping")
    public String ping() {
        return "OK";
    }

}
