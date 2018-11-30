/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dtos;

import entities.TypeOfResource;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import lombok.Getter;
import lombok.Setter;

/**
 *
 * @author Carolina Marques
 */
@XmlRootElement(name = "Resource")
@XmlAccessorType(XmlAccessType.FIELD)
class ResourceDTO extends ConfigurationCaracteristicDTO{
    
    private @Getter @Setter TypeOfResource type; //hardware ou serviço cloud

    public ResourceDTO() {
    }

    public ResourceDTO(TypeOfResource type, int id, String name, String description) {
        super(id, name, description);
        this.type = type;
    }

    @Override
    public void clear(){
        type = null;
    }
}
