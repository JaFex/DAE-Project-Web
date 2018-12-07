/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

import lombok.Getter;
import lombok.Setter;
import javax.persistence.Entity;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

/**
 * @author João Felix nº2161347
 * @author Carolina Marques nº2150644
 * @author Elton Pastilha nº2160849
 */
@Entity
@Table(name = "ADMINISTRATORS")
@NamedQueries(value = {
    @NamedQuery(name = "Administrator.all", query = "SELECT a FROM Administrator a"),
})
public class Administrator extends User{
    
    @NotNull
    private @Getter @Setter String name;
    
    @NotNull
    private @Getter @Setter String role;
    
    @NotNull
    private @Getter @Setter String email;

    public Administrator() {
    }

    public Administrator(String name, String role, String username, String password, String email) {
        super(username, password);
        this.name = name;
        this.role = role;
        this.email = email;
    }
    
    
    
}
