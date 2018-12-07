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
 * @author João Felix nº2161347
 * @author Carolina Marques nº2150644
 * @author Elton Pastilha nº2160849
 */
@XmlRootElement(name = "MaintenanceContract")
@XmlAccessorType(XmlAccessType.FIELD)
class MaintenanceContractDTO extends ConfigurationCaracteristicDTO{

    public MaintenanceContractDTO() {
    }
    
}
