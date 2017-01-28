/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.avbravo.myapp.provider;

import com.mongodb.MongoClient;

/**
 *
 * @author avbravo
 */
public class MongoClientProvider {

    private MongoClient mongoClient = null;

    public MongoClient getMongoClient() {
        mongoClient = new MongoClient();
        try {
            /**
             * autentificacion
             */
            /*
             String database = "";
            String username = "";
            String password = "";
            String host = "localhost";
            int port = 27017;
            char[] charArray = password.toCharArray();
            MongoCredential credential = MongoCredential.createCredential(username, database, charArray);
            mongoClient = new MongoClient(new ServerAddress(host, port), Arrays.asList(credential));
             */
        } catch (Exception e) {
            System.out.println("getMongoClient() " + e.getLocalizedMessage());
        }
        return mongoClient;
    }

}
