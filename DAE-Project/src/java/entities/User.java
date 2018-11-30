/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

import java.io.Serializable;
import lombok.Getter;
import lombok.Setter;
import javax.persistence.Id;

import javax.persistence.MappedSuperclass;
import javax.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;

@MappedSuperclass
public class User implements Serializable {
    
    @Id
    @NotNull
    private @Getter @Setter String username;
    private @Getter @Setter String password;

    public User() {
    }

    public User(String username, String password) {
        this.username = username;
        this.password = password;
    }
    
}
