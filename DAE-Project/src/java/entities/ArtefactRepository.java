/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

import java.util.ArrayList;
import java.util.List;
import lombok.Getter;
import lombok.Setter;

/**
 *
 * @author Carolina Marques
 */
class ArtefactRepository extends ConfigurationCaracteristic{

    private @Getter @Setter String sourceCode;
    private @Getter @Setter List<String> dataBases;
    private @Getter @Setter List<String> sripts;
    private @Getter @Setter List<String> libraries;
    
    public ArtefactRepository() {
    }

    public ArtefactRepository(String sourceCode, int id, String description) {
        super(id, description);
        this.sourceCode = sourceCode;
        dataBases = new ArrayList<>();
        sripts = new ArrayList<>();
        libraries = new ArrayList<>();
    }
       
}
