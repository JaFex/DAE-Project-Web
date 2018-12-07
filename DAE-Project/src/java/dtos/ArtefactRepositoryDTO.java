/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dtos;

import entities.ConfigurationCaracteristic;
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
@XmlRootElement(name = "ArtefactRepository")
@XmlAccessorType(XmlAccessType.FIELD)
public class ArtefactRepositoryDTO extends ConfigurationCaracteristicDTO{

    private @Getter @Setter String sourceCode;
    private @Getter @Setter List<String> dataBases;
    private @Getter @Setter List<String> scripts;
    private @Getter @Setter List<String> libraries;
    
    public ArtefactRepositoryDTO() {
    }

    public ArtefactRepositoryDTO(String sourceCode, int id, String name, String description) {
        super(id, name, description);
        this.sourceCode = sourceCode;
        dataBases = new ArrayList<>();
        scripts = new ArrayList<>();
        libraries = new ArrayList<>();
    }
       
    @Override
    public void clear() {
        sourceCode = null;
        dataBases = null;
        scripts = null;
        libraries = null;
    }   
}
