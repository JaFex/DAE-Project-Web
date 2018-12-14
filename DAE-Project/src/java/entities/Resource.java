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
@Table(name = "RESOURCES")
@NamedQueries(value = {
    @NamedQuery(name = "Resource.all", query = "SELECT r FROM Resource r"),
})
public class Resource extends ConfigurationCaracteristic{
    
    private @Getter @Setter TypeOfResource type; //hardware ou serviço cloud

    public Resource() {
    }

    public Resource(TypeOfResource type) {
        this.type = type;
    }
        
}
