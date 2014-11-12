package com.db.mongo.daos;

import com.db.mongo.MongoConn;
import com.mongodb.DBCollection;


public class DaoFactory {
    
    public static CourseDAO getCourseDao()
    {
        return (CourseDAO)getDAOByClassAndName(CourseDAO.class,"courses");
    }
    public static AbstractDAO getDAOByClassAndName(Class c,String name)
    {
        try 
        {
            DBCollection collection= getCollection(name);
            
            AbstractDAO d = (AbstractDAO)c.newInstance();
             d.setDbCollection(collection);       
            return d;
        } catch (InstantiationException ex) {
            ex.printStackTrace();
        } catch (IllegalAccessException ex) {
            ex.printStackTrace();
        }
        return null;
    }
     public static DBCollection getCollection(String name)
    {
        return MongoConn.getCollection(name);
    }
}
