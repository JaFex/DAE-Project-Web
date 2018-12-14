/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;

/**
 *
 * @author Carolina Marques
 */
@Entity
@Table(name = "PEOPLE_OF_CONTACT")
@NamedQueries(value = {
    @NamedQuery(name = "PersonOfContact.all", query = "SELECT p FROM PersonOfContact p"),
})
public class PersonOfContact implements Serializable{
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private @Getter @Setter Long id;
    
    @NotNull
    private @Getter @Setter String name;
    
    @NotNull
    private @Getter @Setter String email;
    
    @NotNull
    private @Getter @Setter String phoneNumber;
    
    @NotNull
    @ManyToOne(fetch=FetchType.EAGER)
    @JoinColumn(name="PERSONOFCONTACT_ID")
    private @Getter @Setter Client client;

    public PersonOfContact() {
    }

    public PersonOfContact(Long id, String name, String email, String phoneNumber) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }  
}
