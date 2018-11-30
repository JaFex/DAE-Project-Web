/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dtos;
import entities.State;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import lombok.Getter;
import lombok.Setter;

/**
 *
 * @author Carolina Marques
 */
@XmlRootElement(name = "Configuration")
@XmlAccessorType(XmlAccessType.FIELD)
public class ConfigurationDTO implements DTO{

    private @Getter @Setter String descricao;
    private @Getter @Setter State state;
    private @Getter @Setter String softwareName;
    private @Getter @Setter String baseVersion;
    private @Getter @Setter List<ModuleDTO> modulesList;
    private @Getter @Setter List<ResourceDTO> usedResourcesList;
    private @Getter @Setter List<LicenseDTO> activatedLicensesList;
    private @Getter @Setter List<ParameterizationDTO> activatedParameterizationsList;
    private @Getter @Setter List<ExtensionDTO> usedExtensionsList;
    private @Getter @Setter MaintenanceContractDTO maintenanceContractData;
    private @Getter @Setter List<ArtefactRepositoryDTO> repositoryFactsList; 
    private @Getter @Setter List<SupportMaterialDTO> suportMaterialsList; 
    private @Getter @Setter ClientDTO client;

    public ConfigurationDTO() {
    }

    public ConfigurationDTO(String descricao, State state, String softwareName, String baseVersion, MaintenanceContractDTO maintenanceContractData, ClientDTO client) {
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
    
    @Override
    public void clear() {
        descricao = null;
        state = null;
        softwareName = null;
        baseVersion = null;
        modulesList = null;
        usedResourcesList = null;
        activatedLicensesList = null;
        activatedParameterizationsList = null;
        usedExtensionsList = null;
        maintenanceContractData = null;
        repositoryFactsList = null;
        suportMaterialsList = null;
        client = null;
    }   
}
