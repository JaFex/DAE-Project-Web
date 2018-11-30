/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dtos;

import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import lombok.Getter;
import lombok.Setter;

/**
 *
 * @author Carolina Marques
 */
@XmlRootElement(name = "ConfigurationCaracteristic")
@XmlAccessorType(XmlAccessType.FIELD)
class ConfigurationCaracteristicDTO implements DTO{

    @Id
    @NotNull
    private @Getter @Setter int id;
    private @Getter @Setter String name;
    private @Getter @Setter String description;

    public ConfigurationCaracteristicDTO() {
    }

    public ConfigurationCaracteristicDTO(int id, String name, String description) {
        this.id = id;
        this.name = name;
        this.description = description;
    }
    
    @Override
    public void clear() {
        //id = null;
        name = null;
        description = null;
    }
    
}
