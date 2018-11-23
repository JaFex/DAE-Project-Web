package ejbs;

import dtos.ClientDTO;
import entities.Client;
import javax.ejb.Stateless;



@Stateless
public class ClientBean extends BaseBean<Client, ClientDTO, String> {
    
}
