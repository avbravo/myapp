/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.avbravo.myapp.start;

import com.avbravo.myapp.controller.PlanetasController;
import com.avbravo.myapp.entity.Planetas;
import java.util.Date;

/**
 *
 * @author avbravo
 */
public class Start {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        try {
            PlanetasController planetasController = new PlanetasController();
            Planetas planetas = new Planetas("tr26", "Tierra", new Date());
            
            planetasController.guardar(planetas);
        } catch (Exception e) {
        }
    }

}
