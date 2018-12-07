/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import lombok.Getter;
import lombok.Setter;
import javax.persistence.Id;

import javax.persistence.MappedSuperclass;
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

@MappedSuperclass
public class User implements Serializable {
    
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

    public User() {
    }

    public User(String username, String password) {
        this.username = username;
        this.password = password;
        configurationList = new ArrayList<>();
    }   
}
