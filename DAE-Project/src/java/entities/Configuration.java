/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.MappedSuperclass;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Null;
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
    
    @Null
    private @Getter @Setter List<Module> modulesList;
    
    @Null
    private @Getter @Setter List<Resource> usedResourcesList;
    
    @Null
    private @Getter @Setter List<License> activatedLicensesList;
    
    @Null
    private @Getter @Setter List<String> activatedParameterizationsList;
    
    @Null
    private @Getter @Setter List<String> usedExtensionsList;
    
    @NotNull
    private @Getter @Setter MaintenanceContract maintenanceContractData;
    
    @Null
    private @Getter @Setter List<ArtefactRepository> repositoryFactsList; 
    
    @Null
    private @Getter @Setter List<SupportMaterial> suportMaterialsList; 
    
    @Null
    @OneToMany(mappedBy = "messageList", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private @Getter @Setter List<Message> messageList;
    
    @NotNull
    @ManyToOne(fetch=FetchType.EAGER)
    @JoinColumn(name="CONFIGURATION_ID")
    private @Getter @Setter User user;
    
    public Configuration() {
    }

    public Configuration(String descricao, State state, String softwareName, String baseVersion, MaintenanceContract maintenanceContractData) {
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
    }        
    
    public void addModule(Module module){
        if(modulesList.contains(module)){
            return;
        }
        modulesList.add(module);
    }

    public void removeModule(Module module){
        if(!modulesList.contains(module) || modulesList.isEmpty()){
            return;
        }
        modulesList.remove(module);
    }
    public void addResource(Resource resource){
        if(usedResourcesList.contains(resource)){
            return;
        }
        usedResourcesList.add(resource);
    }

    public void removeResource(Resource resource){
        if(!usedResourcesList.contains(resource) || usedResourcesList.isEmpty()){
            return;
        }
        usedResourcesList.remove(resource);
    }
    
    public void addLicense(License license){
        if(activatedLicensesList.contains(license)){
            return;
        }
        activatedLicensesList.add(license);
    }

    public void removeLicense(License license){
        if(!activatedLicensesList.contains(license) || activatedLicensesList.isEmpty()){
            return;
        }
        activatedLicensesList.remove(license);
    }
    
    public void addParameterization(String parameterization){
        if(activatedParameterizationsList.contains(parameterization)){
            return;
        }
        activatedParameterizationsList.add(parameterization);
    }

    public void removeParameterization(String parameterization){
        if(!activatedParameterizationsList.contains(parameterization) || activatedParameterizationsList.isEmpty()){
            return;
        }
        activatedParameterizationsList.remove(parameterization);
    }
    
    public void addExtension(String extension){
        if(usedExtensionsList.contains(extension)){
            return;
        }
        usedExtensionsList.add(extension);
    }

    public void removeExtension(String extension){
        if(!usedExtensionsList.contains(extension) || usedExtensionsList.isEmpty()){
            return;
        }
        usedExtensionsList.remove(extension);
    }
        
    public void addArtefactRepository(ArtefactRepository artefact){
        if(repositoryFactsList.contains(artefact)){
            return;
        }
        repositoryFactsList.add(artefact);
    }

    public void removeArtefactRepository(ArtefactRepository artefact){
        if(!repositoryFactsList.contains(artefact) || repositoryFactsList.isEmpty()){
            return;
        }
        repositoryFactsList.remove(artefact);
    }
    
    public void addSupportMaterial(SupportMaterial supportMaterial){
        if(suportMaterialsList.contains(supportMaterial)){
            return;
        }
        suportMaterialsList.add(supportMaterial);
    }

    public void removeSupportMaterial(SupportMaterial supportMaterial){
        if(!suportMaterialsList.contains(supportMaterial) || suportMaterialsList.isEmpty()){
            return;
        }
        suportMaterialsList.remove(supportMaterial);
    }
}
