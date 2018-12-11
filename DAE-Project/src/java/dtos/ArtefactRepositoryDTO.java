/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dtos;

import entities.ConfigurationCaracteristic;
import java.util.ArrayList;
import java.util.List;
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
@XmlRootElement(name = "ArtefactRepository")
@XmlAccessorType(XmlAccessType.FIELD)
public class ArtefactRepositoryDTO extends ConfigurationCaracteristicDTO{

    @NotNull
    private @Getter @Setter String sourceCode;
    
    @NotNull
    private @Getter @Setter List<String> dataBases;
    
    @NotNull
    private @Getter @Setter List<String> scripts;
    
    @NotNull
    private @Getter @Setter List<String> libraries;
    
    public ArtefactRepositoryDTO() {
    }

    public ArtefactRepositoryDTO(String sourceCode, String name, String description) {
        super(name, description);
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
