/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

import javax.persistence.Entity;
import javax.persistence.Table;
import lombok.Getter;
import lombok.Setter;

/**
 *
 * @author Carolina Marques
 */
@Entity
@Table(name = "RESOURCES")
class Resource extends ConfigurationCaracteristic{
    
    private @Getter @Setter TypeOfResource type; //hardware ou serviço cloud

    public Resource() {
    }

    public Resource(TypeOfResource type) {
        this.type = type;
    }
        
}