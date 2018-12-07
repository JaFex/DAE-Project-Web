/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
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
@Entity
@Table(name = "CONFIGURATIONS")
public class Configuration implements Serializable{
    
    @Id
    @NotNull
    private @Getter @Setter Long id; 
    private @Getter @Setter String descricao;
    private @Getter @Setter State state;
    private @Getter @Setter String softwareName;
    private @Getter @Setter String baseVersion;
    private @Getter @Setter List<Module> modulesList;
    private @Getter @Setter List<Resource> usedResourcesList;
    private @Getter @Setter List<License> activatedLicensesList;
    private @Getter @Setter List<Parameterization> activatedParameterizationsList;
    private @Getter @Setter List<Extension> usedExtensionsList;
    private @Getter @Setter MaintenanceContract maintenanceContractData;
    private @Getter @Setter List<ArtefactRepository> repositoryFactsList; 
    private @Getter @Setter List<SupportMaterial> suportMaterialsList; 
    
    @ManyToOne
    @JoinColumn(name="CLIENT_ID")
    private @Getter @Setter Client client;

    public Configuration() {
    }

    public Configuration(String descricao, State state, String softwareName, String baseVersion, MaintenanceContract maintenanceContractData, Client client) {
        this.descricao = descricao;
        this.state = state;
        this.softwareName = softwareName;
        this.baseVersion = baseVersion;
        modulesList = new ArrayList<>();
        usedResourcesList = new ArrayList<>();
        activatedLicensesList = new ArrayList<>();
        activatedParameterizationsList = new ArrayList<>();
        usedExtensionsList = new ArrayList<>();
        this.maintenanceContractData = maintenanceContractData;
        repositoryFactsList = new ArrayList<>();
        suportMaterialsList = new ArrayList<>();
        this.client = client;
    }
         
}
