/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejbs;

import dtos.MaintenanceContractDTO;
import entities.MaintenanceContract;
import javax.ejb.Stateless;
import javax.ws.rs.Path;

/**
 * @author João Felix nº2161347
 * @author Carolina Marques nº2150644
 * @author Elton Pastilha nº2160849
 */
@Stateless
@Path("/maintenance_contracts")
public class MaintenanceContractBean extends BaseBean<MaintenanceContract, MaintenanceContractDTO, Long> {
    
}
