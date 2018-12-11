/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dtos;

import entities.Frequency;
import java.util.Date;
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
@XmlRootElement(name = "MaintenanceContract")
@XmlAccessorType(XmlAccessType.FIELD)
public class MaintenanceContractDTO extends ConfigurationCaracteristicDTO{

    @NotNull
    private @Getter @Setter float valueToPay;
    
    @NotNull
    private @Getter @Setter Frequency frequencyToPay;
    
    @NotNull
    private @Getter @Setter int duration;
    
    @NotNull
    private @Getter @Setter Date beginningDate;

    public MaintenanceContractDTO() {
    }

    public MaintenanceContractDTO(float valueToPay, Frequency frequencyToPay, int duration, Date beginningDate, String description, String name) {
        super(description, name);
        this.valueToPay = valueToPay;
        this.frequencyToPay = frequencyToPay;
        this.duration = duration;
        this.beginningDate = beginningDate;
    }
    
    public void clear(){
        valueToPay = 0;
        frequencyToPay = null;
        duration = 0;
        beginningDate = null;       
    }   
}
