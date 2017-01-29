/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.avbravo.myapp.controller;

import com.avbravo.myapp.ejb.PlanetasFacade;
import com.avbravo.myapp.entity.Planetas;
import java.util.List;

/**
 *
 * @author avbravo
 */
public class PlanetasController {

    PlanetasFacade planetasFacade = new PlanetasFacade();
    Planetas planetas = new Planetas();

    /**
     *
     */
    public void guardar(Planetas planetas) {
        try {
            //  Planetas t = planetasFacade.findById("idplaneta", planetas.getIdplaneta());

            Planetas t = planetasFacade.find("idplaneta", planetas.getIdplaneta());
            if (t == null) {

                if (planetasFacade.save(planetas)) {
                    System.out.println("Guardado");
                } else {
                    System.out.println("No se pudo guardar " + planetasFacade.getException());
                }
            } else {
                System.out.println("Existe un planeta con ese idplaneta");

            }

        } catch (Exception e) {
            System.out.println("guardar() " + e.getLocalizedMessage());
        }
    }

    /**
     * .
     */
    public void mostrar() {
        try {
            List<Planetas> list = planetasFacade.findAll();
            if (list.isEmpty()) {
                System.out.println("No hay planetas registrados");
            } else {
                for (Planetas p : list) {
                    System.out.println(p.toString());
                }
            }
        } catch (Exception e) {
            System.out.println("mostrar() " + e.getLocalizedMessage());
        }

    }

    /**
     *
     * @param idplaneta
     * @return
     */
    public Planetas buscar(String idplaneta) {
        Planetas p = new Planetas();
        try {
            p = planetasFacade.find("idplaneta", idplaneta);
            if (p == null) {
                System.out.println("No hay planetas con ese codigo");
            }
        } catch (Exception e) {
            System.out.println("buscar() " + e.getLocalizedMessage());
        }
        return p;
    }

    public void eliminar(String idplaneta) {
        try {
            planetasFacade.delete("idplaneta", idplaneta);
        } catch (Exception e) {
            System.out.println("eliminar() " + e.getLocalizedMessage());
        }
    }

    /**
     *
     * @param p
     */
    public void actualizar(Planetas p) {
        try {
            planetasFacade.update(p);
        } catch (Exception e) {
            System.out.println("actualizar() " + e.getLocalizedMessage());
        }
    }
}
