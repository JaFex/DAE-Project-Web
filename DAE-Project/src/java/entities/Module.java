/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

import lombok.Getter;
import lombok.Setter;

/**
 *
 * @author Carolina Marques
 */
class Module extends ConfigurationCaracteristic{
    
    private @Getter @Setter String state; //adicionado ou configurado

    public Module() {
    }

    public Module(String state, int id, String description) {
        super(id, description);
        this.state = state;
    }
   
}
