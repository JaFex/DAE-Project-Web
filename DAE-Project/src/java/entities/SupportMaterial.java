/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

import java.util.ArrayList;
import java.util.List;
import lombok.Getter;
import lombok.Setter;

/**
 *
 * @author Carolina Marques
 */
class SupportMaterial extends ConfigurationCaracteristic{
    
    private @Getter @Setter List<String> userManualsList;
    private @Getter @Setter List<String> programmerManualsList;
    private @Getter @Setter List<String> tutorialsList;
    private @Getter @Setter List<String> linksForSitesInProductionsList;
    private @Getter @Setter List<String> videosList; 
    private @Getter @Setter List<String> knowledgeArticlesList;
    private @Getter @Setter List<String> supportDocsList;

    public SupportMaterial() {
        userManualsList = new ArrayList<>();
        programmerManualsList = new ArrayList<>();
        tutorialsList = new ArrayList<>();
        linksForSitesInProductionsList = new ArrayList<>();
        videosList = new ArrayList<>(); //??
        knowledgeArticlesList = new ArrayList<>();
        supportDocsList = new ArrayList<>();
    }
       
}
