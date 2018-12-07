package ejbs;

import dtos.UserDTO;
import entities.User;
import javax.ejb.Stateless;
/**
 * @author João Felix nº2161347
 * @author Carolina Marques nº2150644
 * @author Elton Pastilha nº2160849
 */
@Stateless
public class UserBean<E extends User, D extends UserDTO> extends BaseBean<E, D, Long> {
    
}
