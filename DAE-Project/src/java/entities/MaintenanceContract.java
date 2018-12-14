/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;

/**
 * @author João Felix nº2161347
 * @author Carolina Marques nº2150644
 * @author Elton Pastilha nº2160849
 */
@Entity
@Table(name = "MAINTENANCE_CONTRACTS")
@NamedQueries(value = {
    @NamedQuery(name = "MaintenanceContract.all", query = "SELECT m FROM MaintenanceContract m"),
})
public class MaintenanceContract extends ConfigurationCaracteristic{
    
    @NotNull
    private @Getter @Setter float valueToPay;
    
    @NotNull
    private @Getter @Setter Frequency frequencyToPay;
    
    @NotNull
    private @Getter @Setter int duration;
    
    @NotNull
    private @Getter @Setter Date beginningDate;

    public MaintenanceContract() {
    }

    public MaintenanceContract(float valueToPay, Frequency frequencyToPay, int duration, Date beginningDate, String description, String name) {
        super(description, name);
        this.valueToPay = valueToPay;
        this.frequencyToPay = frequencyToPay;
        this.duration = duration;
        this.beginningDate = beginningDate;
    }
}
