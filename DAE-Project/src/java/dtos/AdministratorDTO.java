package dtos;

import lombok.Getter;
import lombok.Setter;

public class AdministratorDTO extends UserDTO {
    
    private @Getter @Setter String name;
    private @Getter @Setter String role;
    private @Getter @Setter String email;

    public AdministratorDTO() {
    }

    public AdministratorDTO(String name, String role, String email, String username, String password) {
        super(username, password);
        this.name = name;
        this.role = role;
        this.email = email;
    } 
    
    @Override
    public void clear() {
        name = null;
        role = null;
        email = null;
    }
}
