/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dtos;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
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
@XmlRootElement(name = "ConfigurationCaracteristic")
@XmlAccessorType(XmlAccessType.FIELD)
public class ConfigurationCaracteristicDTO implements DTO{

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private @Getter @Setter Long id;
    
    @NotNull
    private @Getter @Setter String name;
    
    @NotNull
    private @Getter @Setter String description;

    public ConfigurationCaracteristicDTO() {
    }

    public ConfigurationCaracteristicDTO(String name, String description) {
        this.name = name;
        this.description = description;
    }
    
    @Override
    public void clear() {
        name = null;
        description = null;
    }    
}
