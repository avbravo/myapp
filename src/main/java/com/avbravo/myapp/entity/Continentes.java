/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.avbravo.myapp.entity;

import com.avbravo.jmoordb.anotations.Embedded;
import com.avbravo.jmoordb.anotations.Id;
import java.util.List;
import lombok.Getter;
import lombok.Setter;

/**
 *
 * @author avbravo
 */
@Getter
@Setter
public class Continentes {

    @Id
    private String idcontinente;
    private String continente;
    @Embedded
    private Planetas planetas;

    @Override
    public String toString() {
        return "Continentes{" + "idcontinente=" + idcontinente + ", continente=" + continente + ", planetas=" + planetas + '}';
    }
}
