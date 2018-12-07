/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dtos;

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
@XmlRootElement(name = "Module")
@XmlAccessorType(XmlAccessType.FIELD)
public class ModuleDTO extends ConfigurationCaracteristicDTO{
    
    private @Getter @Setter String state; //adicionado ou configurado

    public ModuleDTO() {
    }

    public ModuleDTO(String state, int id, String name, String description) {
        super(id, name, description);
        this.state = state;
    }
    
    @Override
    public void clear(){
        state = null;
    }
 
}
