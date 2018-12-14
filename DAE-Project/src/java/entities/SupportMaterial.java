/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import lombok.Getter;
import lombok.Setter;

/**
 * @author João Felix nº2161347
 * @author Carolina Marques nº2150644
 * @author Elton Pastilha nº2160849
 */
@Entity
@Table(name = "SUPPORT_MATERIALS")
@NamedQueries(value = {
    @NamedQuery(name = "SupportMaterial.all", query = "SELECT su FROM SupportMaterial su"),
})
public class SupportMaterial extends ConfigurationCaracteristic{
    
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
    
    private void addUserManual(String userManual){
        if(userManualsList.contains(userManual)){
            return;
        }
        userManualsList.add(userManual);
    }
    
    private void removeUserManual(String userManual){
        if(!userManualsList.contains(userManual) || userManualsList.isEmpty()){
            return;
        }
        userManualsList.remove(userManual);
    }
    
    private void addProgrammerManual(String programmerManual){
        if(programmerManualsList.contains(programmerManual)){
            return;
        }
        userManualsList.add(programmerManual);
    }
    
    private void removeProgrammerManual(String programmerManual){
        if(!programmerManualsList.contains(programmerManual) || programmerManualsList.isEmpty()){
            return;
        }
        programmerManualsList.remove(programmerManual);
    }
    
    private void addTutorial(String tutorial){
        if(tutorialsList.contains(tutorial)){
            return;
        }
        tutorialsList.add(tutorial);
    }
    
    private void removeTutorial(String tutorial){
        if(!tutorialsList.contains(tutorial) || tutorialsList.isEmpty()){
            return;
        }
        tutorialsList.remove(tutorial);
    }
    
    private void addLink(String link){
        if(linksForSitesInProductionsList.contains(link)){
            return;
        }
        linksForSitesInProductionsList.add(link);
    }
    
    private void removeLink(String link){
        if(!linksForSitesInProductionsList.contains(link) || linksForSitesInProductionsList.isEmpty()){
            return;
        }
        linksForSitesInProductionsList.remove(link);
    }
    
    private void addVideo(String video){
        if(videosList.contains(video)){
            return;
        }
        videosList.add(video);
    }
    
    private void removeVideo(String video){
        if(!videosList.contains(video) || videosList.isEmpty()){
            return;
        }
        videosList.remove(video);
    }
    
    private void addknowledgeArticle(String knowledgeArticle){
        if(knowledgeArticlesList.contains(knowledgeArticle)){
            return;
        }
        knowledgeArticlesList.add(knowledgeArticle);
    }
    
    private void removeknowledgeArticle(String knowledgeArticle){
        if(!knowledgeArticlesList.contains(knowledgeArticle) || knowledgeArticlesList.isEmpty()){
            return;
        }
        knowledgeArticlesList.remove(knowledgeArticle);
    }
    
    private void addsupportDoc(String supportDoc){
        if(supportDocsList.contains(supportDoc)){
            return;
        }
        supportDocsList.add(supportDoc);
    }
    
    private void removesupportDoc(String supportDoc){
        if(!supportDocsList.contains(supportDoc) || supportDocsList.isEmpty()){
            return;
        }
        supportDocsList.remove(supportDoc);
    }
}
