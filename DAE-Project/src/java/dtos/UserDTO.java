package dtos;

import entities.Configuration;
import entities.Message;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Null;
import lombok.Getter;
import lombok.Setter;
/**
 * @author João Felix nº2161347
 * @author Carolina Marques nº2150644
 * @author Elton Pastilha nº2160849
 */
public class UserDTO implements DTO {

    @Id
    @GeneratedValue
    private @Getter @Setter Long id;
    
    @NotNull
    private @Getter @Setter String username;
    
    @NotNull
    private @Getter @Setter String password;
    
    @Null
    @OneToMany(mappedBy = "configuration", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private @Getter @Setter List<Configuration> configurationList;
    
    @Null
    @OneToMany(mappedBy = "message", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private @Getter @Setter List<Message> messageList;

    public UserDTO() {
    }

    public UserDTO(String username, String password) {
        this.username = username;
        this.password = password;
        configurationList = new ArrayList<>();
    }
    
    @Override
    public void clear() {
        username = null;
        password = null;
        configurationList = null;
    }
}
