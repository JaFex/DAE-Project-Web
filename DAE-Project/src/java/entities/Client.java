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
import javax.persistence.Entity;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 *
 * @author Carolina Marques
 */

@Entity
@Table(name = "CLIENTS")
@NamedQuery(name = "getAllClients", query = "SELECT c FROM Client c")
public class Client extends User{
    
    private @Getter @Setter String nameOfCompany;
    private @Getter @Setter String address;
    private @Getter @Setter String personOfContact;
    private @Getter @Setter List<Configuration> configurationsList;

    public Client() {
    }

    public Client(String nameOfCompany, String address, String personOfContact, String username, String password) {
        super(username, password);
        this.nameOfCompany = nameOfCompany;
        this.address = address;
        this.personOfContact = personOfContact;
        configurationsList = new ArrayList<>();
    }  
    
}
