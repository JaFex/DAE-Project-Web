/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

import javax.persistence.Entity;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import lombok.Getter;
import lombok.Setter;

/**
 * @author João Felix nº2161347
 * @author Carolina Marques nº2150644
 * @author Elton Pastilha nº2160849
 */
@Entity
@Table(name = "MODULES")
@NamedQueries(value = {
    @NamedQuery(name = "Module.all", query = "SELECT mo FROM Module mo"),
})
public class Module extends ConfigurationCaracteristic{
    
    private @Getter @Setter String state; //adicionado ou configurado

    public Module() {
    }

    public Module(String state, String description, String name) {
        super(description, name);
        this.state = state;
    }
}
