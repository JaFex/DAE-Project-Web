package ejbs;

import dtos.AdministratorDTO;
import entities.Administrator;
import javax.ejb.Stateless;

@Stateless
public class AdministratorBean extends BaseBean<Administrator, AdministratorDTO, String> {

}
