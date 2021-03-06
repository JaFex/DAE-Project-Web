/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dtos;
import entities.ArtefactRepository;
import entities.License;
import entities.MaintenanceContract;
import entities.Message;
import entities.Module;
import entities.Resource;
import entities.State;
import entities.SupportMaterial;
import entities.User;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Null;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import lombok.Getter;
import lombok.Setter;

/**
 * @author João Felix nº2161347
 * @author Carolina Marques nº2150644
 * @author Elton Pastilha nº2160849
 */
@XmlRootElement(name = "Configuration")
@XmlAccessorType(XmlAccessType.FIELD)
public class ConfigurationDTO implements DTO{

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private @Getter @Setter Long id; 
    
    @NotNull
    private @Getter @Setter String descricao;
    
    @NotNull
    private @Getter @Setter State state;
    
    @NotNull
    private @Getter @Setter String softwareName;
    
    @NotNull
    private @Getter @Setter String baseVersion;
    
    @NotNull
    private @Getter @Setter MaintenanceContract maintenanceContractData;
    
    @NotNull
    @ManyToOne(fetch=FetchType.EAGER)
    @JoinColumn(name="CONFIGURATION_ID")
    private @Getter @Setter User user;
    
    public ConfigurationDTO() {
    }

    public ConfigurationDTO(String descricao, State state, String softwareName, String baseVersion, MaintenanceContract maintenanceContractData) {
        this.descricao = descricao;
        this.state = state;
        this.softwareName = softwareName;
        this.baseVersion = baseVersion;
        this.maintenanceContractData = maintenanceContractData;
    }       
    
    @Override
    public void clear() {
        descricao = null;
        state = null;
        softwareName = null;
        baseVersion = null;
        maintenanceContractData = null;
    }   
}
