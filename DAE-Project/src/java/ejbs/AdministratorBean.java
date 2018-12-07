package ejbs;

import dtos.AdministratorDTO;
import entities.Administrator;
import java.util.List;
import javax.ejb.Stateless;
import javax.ws.rs.Path;
/**
 * @author João Felix nº2161347
 * @author Carolina Marques nº2150644
 * @author Elton Pastilha nº2160849
 */
@Stateless
@Path("/administrators")
public class AdministratorBean extends BaseBean<Administrator, AdministratorDTO, Long> {


    
    
}
