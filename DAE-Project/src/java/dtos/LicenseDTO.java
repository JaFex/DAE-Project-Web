/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dtos;

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
@XmlRootElement(name = "License")
@XmlAccessorType(XmlAccessType.FIELD)
public class LicenseDTO extends ConfigurationCaracteristicDTO{

    @NotNull
    private @Getter @Setter Date beginningDate;
    
    @NotNull
    private @Getter @Setter Date endDate;

    public LicenseDTO() {
    }

    public LicenseDTO(Date beginningDate, Date endDate, String description, String name) {
        super(description, name);
        this.beginningDate = beginningDate;
        this.endDate = endDate;
    }
    
    @Override
    public void clear(){
        beginningDate = null;
        endDate = null;
    }    
}
