/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.avbravo.myapp.ejb;

import com.avbravo.jmoordb.mongodb.facade.AbstractFacade;
import com.avbravo.myapp.entity.Continentes;
import com.avbravo.myapp.provider.MongoClientProvider;
import com.mongodb.MongoClient;

/**
 *
 * @author avbravo
 */
public class ContinentesFacade extends AbstractFacade<Continentes> {

    MongoClientProvider mongoclientProvider = new MongoClientProvider();

    public ContinentesFacade() {
        super(Continentes.class, "myappdb", "continentes");
    }

    @Override
    protected MongoClient getMongoClient() {
        return mongoclientProvider.getMongoClient();
    }

    @Override
    public Object findById(String key, String value) {
        return find(key, value);
    }

    @Override
    public Object findById(String key, Integer value) {
        return find(key, value);
    }

}
