/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Senukai;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 *
 * @author Laurynas
 */
@Path("/Sandelis")
public class Senukai {
    @GET
    @Path("/Prekes")
    @Produces(MediaType.APPLICATION_JSON)
    public String GetData(){
        return "Senukai";
    }
}
