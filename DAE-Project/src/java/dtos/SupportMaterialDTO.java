/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dtos;

import java.util.ArrayList;
import java.util.List;
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

@XmlRootElement(name = "SupportMaterial")
@XmlAccessorType(XmlAccessType.FIELD)
public class SupportMaterialDTO extends ConfigurationCaracteristicDTO{
    
    public SupportMaterialDTO() {
    }
    
    @Override
    public void clear(){
    }
}
