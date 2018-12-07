/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;

/**
 * @author João Felix nº2161347
 * @author Carolina Marques nº2150644
 * @author Elton Pastilha nº2160849
 */
@MappedSuperclass
public class ConfigurationCaracteristic implements Serializable{
    @Id
    @NotNull
    private @Getter @Setter Long id;
    private @Getter @Setter String name;
    private @Getter @Setter String description;

    public ConfigurationCaracteristic() {
    }

    public ConfigurationCaracteristic(Long id, String description, String name) {
        this.id = id;
        this.description = description;
        this.name = name;
    }
}
