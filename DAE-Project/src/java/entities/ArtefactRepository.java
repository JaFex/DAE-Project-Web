/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.Table;
import lombok.Getter;
import lombok.Setter;

/**
 *
 * @author Carolina Marques
 */
@Entity
@Table(name = "ARTEFACTS_REPOSITORY")
class ArtefactRepository extends ConfigurationCaracteristic{

    private @Getter @Setter String sourceCode;
    private @Getter @Setter List<String> dataBases;
    private @Getter @Setter List<String> scripts;
    private @Getter @Setter List<String> libraries;
    
    public ArtefactRepository() {
    }

    public ArtefactRepository(String sourceCode, int id, String description, String name) {
        super(id, description, name);
        this.sourceCode = sourceCode;
        dataBases = new ArrayList<>();
        scripts = new ArrayList<>();
        libraries = new ArrayList<>();
    }

    
    
    
       
}