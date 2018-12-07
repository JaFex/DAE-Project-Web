package dtos;

import lombok.Getter;
import lombok.Setter;
/**
 * @author João Felix nº2161347
 * @author Carolina Marques nº2150644
 * @author Elton Pastilha nº2160849
 */
public class UserDTO implements DTO {

    protected @Getter @Setter Long id;
    protected @Getter @Setter String username;
    protected @Getter @Setter String password;    
    
    public UserDTO() {
        
    }
    
    public UserDTO(String username, String password) {
        this.username = username;
        this.password = password;
    }
    
    @Override
    public void clear() {
        username = null;
        password = null;
    }
}
