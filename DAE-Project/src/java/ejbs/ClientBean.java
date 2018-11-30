package ejbs;

import dtos.ClientDTO;
import entities.Client;
import java.util.List;
import javax.ejb.Stateless;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;



@Stateless
@Path("/clients")
public class ClientBean extends BaseBean<Client, ClientDTO, String> {

    
}
