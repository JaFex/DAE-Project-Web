/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dtos;

import entities.Configuration;
import entities.User;
import java.util.Date;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
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
@XmlRootElement(name = "Message")
@XmlAccessorType(XmlAccessType.FIELD)
public class MessageDTO implements DTO{
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private @Getter @Setter Long id;

    @NotNull
    private @Getter @Setter String description;
    
    @NotNull
    private @Getter @Setter Date dateOfCreation;
    
    @NotNull
    @ManyToOne(fetch=FetchType.EAGER)
    @JoinColumn(name="MESSAGE_ID")
    private @Getter @Setter User user;
    
    @NotNull
    @ManyToOne(fetch=FetchType.EAGER)
    @JoinColumn(name="MESSAGELIST_ID")
    private @Getter @Setter Configuration configuration;

    public MessageDTO() {
    }

    public MessageDTO(String description, Date dateOfCreation, User user, Configuration configuration) {
        this.description = description;
        this.dateOfCreation = dateOfCreation;
        this.user = user;
        this.configuration = configuration;
    }
    
    @Override
    public void clear(){
        description = null;
        dateOfCreation = null;
        user = null;
        configuration = null;
    } 
}
