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
@Table(name = "LICENSES")
@NamedQueries(value = {
    @NamedQuery(name = "License.all", query = "SELECT l FROM License l"),
})
public class License extends ConfigurationCaracteristic{
    
    @NotNull
    private @Getter @Setter Date beginningDate;
    
    @NotNull
    private @Getter @Setter Date endDate;

    public License() {
    }

    public License(Date beginningDate, Date endDate, String description, String name) {
        super(description, name);
        this.beginningDate = beginningDate;
        this.endDate = endDate;
    }
}
