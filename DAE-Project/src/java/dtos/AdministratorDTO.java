package dtos;

import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import lombok.Getter;
import lombok.Setter;
/**
 * @author João Felix nº2161347
 * @author Carolina Marques nº2150644
 * @author Elton Pastilha nº2160849
 */
@XmlRootElement(name = "Administrator")
@XmlAccessorType(XmlAccessType.FIELD)
public class AdministratorDTO extends UserDTO {
    
    @NotNull
    private @Getter @Setter String name;
    
    @NotNull
    private @Getter @Setter String role;
    
    @NotNull
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
