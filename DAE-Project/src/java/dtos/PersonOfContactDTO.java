/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dtos;

import entities.Client;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import lombok.Getter;
import lombok.Setter;

/**
 *
 * @author Carolina Marques
 */
@XmlRootElement(name = "PersonOfContact")
@XmlAccessorType(XmlAccessType.FIELD)
public class PersonOfContactDTO implements DTO{
    
    @Id
    @GeneratedValue
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

    public PersonOfContactDTO() {
    }

    public PersonOfContactDTO(String name, String email, String phoneNumber) {
        this.name = name;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }
    
    @Override
    public void clear(){
        name = null;
        email = null;
        phoneNumber = null;
    }    
}
