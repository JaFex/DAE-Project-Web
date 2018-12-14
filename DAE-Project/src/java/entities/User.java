/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.CascadeType;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import lombok.Getter;
import lombok.Setter;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;

import javax.persistence.MappedSuperclass;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Null;
import lombok.Getter;
import lombok.Setter;

/**
 * @author João Felix nº2161347
 * @author Carolina Marques nº2150644
 * @author Elton Pastilha nº2160849
 */

@Entity
@Table(name = "USERS")
@NamedQueries(value = {
    @NamedQuery(name = "User.all", query = "SELECT c FROM User c"),
})
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public class User implements Serializable {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private @Getter @Setter Long id;
    
    @NotNull
    private @Getter @Setter String username;
    
    @NotNull
    private @Getter @Setter String password;
    
    @Null
    @OneToMany(mappedBy = "userConfiguration", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private @Getter @Setter List<Configuration> configurationList;
    
    @Null
    @OneToMany(mappedBy = "userMessage", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private @Getter @Setter List<Message> messageList;

    public User() {
    }

    public User(String username, String password) {
        this.username = username;
        this.password = password;
        configurationList = new ArrayList<>();
    }   
    
    private void addConfiguration(Configuration configuration){
        if(configurationList.contains(configuration)){
            return;
        }
        configurationList.add(configuration);
    }
    
    private void removeObjectFromList(Configuration configuration){
        if(!configurationList.contains(configuration) || configurationList.isEmpty()){
            return;
        }
        configurationList.remove(configuration);
    } 
}
