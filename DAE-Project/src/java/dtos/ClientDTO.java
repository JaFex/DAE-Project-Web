/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dtos;

import entities.Configuration;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import lombok.Getter;
import lombok.Setter;

@XmlRootElement(name = "Client")
@XmlAccessorType(XmlAccessType.FIELD)
public class ClientDTO extends UserDTO {
    
    private @Getter @Setter String nameOfCompany;
    private @Getter @Setter String address;
    private @Getter @Setter String personOfContact;
    private @Getter @Setter List<Configuration> configurationsList;


    public ClientDTO() {
    }

    public ClientDTO(String nameOfCompany, String address, String personOfContact, String username, String password) {
        super(username, password);
        this.nameOfCompany = nameOfCompany;
        this.address = address;
        this.personOfContact = personOfContact;
        configurationsList = new ArrayList<>();
    }    
    
    @Override
    public void clear() {
        nameOfCompany = null;
        address = null;
        personOfContact = null;
    }
}
