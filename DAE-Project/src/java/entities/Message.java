/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;

/**
 *
 * @author Carolina Marques
 */
@Entity
@Table(name = "MESSAGES")
public class Message implements Serializable{

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private @Getter @Setter Long id;

    @NotNull
    private @Getter @Setter String description;
    
    @NotNull
    private @Getter @Setter Date dateOfCreation;
    
    @NotNull
    @ManyToOne(fetch=FetchType.EAGER)
    @JoinColumn(name="USERMESSAGE_ID")
    private @Getter @Setter User userMessage;
    
    @NotNull
    @ManyToOne(fetch=FetchType.EAGER)
    @JoinColumn(name="CONFIGURATIONMESSAGE_ID")
    private @Getter @Setter Configuration configurationMessage;

    public Message() {
    }

    public Message(String description, Date dateOfCreation, User user, Configuration configuration) {
        this.description = description;
        this.dateOfCreation = dateOfCreation;
        this.userMessage = user;
        this.configurationMessage = configuration;
    }    
}
