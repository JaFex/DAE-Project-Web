/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package web;


import dtos.ClientDTO;
import ejbs.AdministratorBean;
import ejbs.ClientBean;
import java.util.List;
import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

/**
 *
 * @author joaofelix
 */

@ManagedBean(name = "am")
@SessionScoped
public class AdministratorManager {
    
    @EJB
    private ClientBean cb;
    
    @EJB
    private AdministratorBean ab;
    
    public List<ClientDTO> getClients(){
        return cb.all();
    }
}
