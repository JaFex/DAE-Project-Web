package ejbs;

import dtos.AdministratorDTO;
import dtos.ClientDTO;
import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.ejb.Singleton;
import javax.ejb.Startup;


@Singleton
@Startup
public class ConfigBean {

    @EJB
    private AdministratorBean administratorBean;
    
    @EJB
    private ClientBean clientBean;
    
    @PostConstruct
    public void populateBD() {
        try {
            AdministratorDTO administratorDTO= new AdministratorDTO("John", "Amin", "admin@admin.com", "admin", "password");
            AdministratorDTO meicm = administratorBean.create(new AdministratorDTO("John", "Amin", "admin@admin.com", "admin", "password"));
            AdministratorDTO mcif = administratorBean.create(new AdministratorDTO("Alex", "Amin", "alex@admin.com", "alex", "password"));
            
            ClientDTO dae = clientBean.create(new ClientDTO("Unclo", "Rua", "525565465", "foro", "password"));
            ClientDTO ltp = clientBean.create(new ClientDTO("Unclo", "Rua", "525565465", "fooro", "password"));

        } catch (Exception e) {
            System.err.println("[ERROR] @ Application bootstrap | Cause: " + e.getMessage());
        }
    }
}
