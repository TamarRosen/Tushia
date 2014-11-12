package com.db;


import static org.junit.Assert.*;

import org.codehaus.jackson.map.ObjectMapper;
import org.junit.Test;

import com.db.mongo.daos.DaoFactory;
import com.model.Course;
import com.mongodb.BasicDBObject;

public class MongoAccessTest {	
	
	@Test
	public void testDAO(){
		Course course = new Course();
		course.setId(1);
		course.setTitle("course1");
		course.setNumLessons(10);
		
		ObjectMapper mapper = new ObjectMapper();
		BasicDBObject courseObjIn = mapper.convertValue(course, BasicDBObject.class);
		DaoFactory.getCourseDao().insert(courseObjIn);
		
		BasicDBObject courseObjOut = (BasicDBObject) DaoFactory.getCourseDao().getByID(1);
		
		DaoFactory.getCourseDao().remove(courseObjOut);
		
		assertEquals(courseObjIn, courseObjOut);
	}

}
