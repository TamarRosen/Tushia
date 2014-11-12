package com.db.mongo;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.MongoClient;
import com.mongodb.MongoException;

import java.net.UnknownHostException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class MongoConn {
	
	private static  DB database;
    static{
        try {
        	MongoClient mongoClient = new MongoClient();
    		database = mongoClient.getDB( "tushia" );
        } catch (UnknownHostException ex) {
            Logger.getLogger(MongoConn.class.getName()).log(Level.SEVERE, null, ex);
        } catch (MongoException ex) {
            Logger.getLogger(MongoConn.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
//get collection from database
    public static DBCollection getCollection(String collectionName){
        return database.getCollection(collectionName);
    }
	
}
