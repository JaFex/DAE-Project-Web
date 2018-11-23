/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dtos;

import lombok.Getter;
import lombok.Setter;


public class ClientDTO extends UserDTO {
    
    private @Getter @Setter String nameOfCompany;
    private @Getter @Setter String address;
    private @Getter @Setter String personOfContact;

    public ClientDTO() {
    }

    public ClientDTO(String nameOfCompany, String address, String personOfContact, String username, String password) {
        super(username, password);
        this.nameOfCompany = nameOfCompany;
        this.address = address;
        this.personOfContact = personOfContact;
    }    
    
    @Override
    public void clear() {
        nameOfCompany = null;
        address = null;
        personOfContact = null;
    }
}
