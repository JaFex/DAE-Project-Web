/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dtos;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Carolina Marques
 */
@XmlRootElement(name = "License")
@XmlAccessorType(XmlAccessType.FIELD)
class LicenseDTO extends ConfigurationCaracteristicDTO{

    public LicenseDTO() {
    }
    
}
