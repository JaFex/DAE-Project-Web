/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

import javax.persistence.Entity;
import javax.persistence.Table;

/**
 *
 * @author Carolina Marques
 */
@Entity
@Table(name = "PARAMETRIZATIONS")
class Parameterization extends ConfigurationCaracteristic{

    public Parameterization() {
    }
      
}
