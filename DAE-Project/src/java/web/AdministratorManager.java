/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package web;


import dtos.ClientDTO;
import ejbs.AdministratorBean;
import ejbs.ClientBean;
import java.io.Serializable;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.core.GenericType;
import javax.ws.rs.core.MediaType;


@ManagedBean(name = "am")
@SessionScoped
public class AdministratorManager implements Serializable {
    private Client client;
    private final String baseUri = "http://localhost:8080/DAE-Project/webapi";
    
    private static final Logger logger = Logger.getLogger("web.AdministratorManager");
    
    @EJB
    private ClientBean cb;
    
    @EJB
    private AdministratorBean ab;

    public AdministratorManager() {
        this.client = ClientBuilder.newClient();
        this.cb = null;
        this.ab = null;
    }
    
    public List<ClientDTO> getAllClientsREST(){ //GET, UPDATE E DELETE
        List<ClientDTO> returned = null;
        try{
            returned = client.target(baseUri).path("/clients/").request(MediaType.APPLICATION_XML).get(new GenericType<List<ClientDTO>>() {});
        }catch(Exception e){
            logger.log(Level.WARNING, "Problem get all student in method getAllClientsREST: {0}", e.getMessage());
        }
        return returned;
    }
    
    public List<ClientDTO> getClients(){
        return cb.all();
    }
}
