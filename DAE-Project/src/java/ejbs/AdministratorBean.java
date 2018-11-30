package ejbs;

import dtos.AdministratorDTO;
import entities.Administrator;
import java.util.List;
import javax.ejb.Stateless;
import javax.ws.rs.Path;

@Stateless
@Path("/administrators")
public class AdministratorBean extends BaseBean<Administrator, AdministratorDTO, String> {

    /*@Path("all")
    @Override
    public List<AdministratorDTO> all() {
        return super.all();
    }*/

    
    
}
