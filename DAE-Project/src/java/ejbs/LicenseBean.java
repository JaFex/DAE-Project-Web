/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejbs;

import dtos.LicenseDTO;
import entities.License;
import javax.ejb.Stateless;
import javax.ws.rs.Path;

/**
 * @author João Felix nº2161347
 * @author Carolina Marques nº2150644
 * @author Elton Pastilha nº2160849
 */
@Stateless
@Path("/licenses")
public class LicenseBean extends BaseBean<License, LicenseDTO, Long> {
    
}
