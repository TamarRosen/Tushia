package com.model;
 
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;

import com.mongodb.BasicDBObject;
 
@XmlRootElement
public class Course{
 
private int id;
private String title;
private int numLessons;
//private int mode;
//private Provider provider;
//private List<Lesson> lessons;

public Course() {}

public String getTitle() {
	return title;
}

public void setTitle(String title) {
	this.title = title;
}

public int getNumLessons() {
	return numLessons;
}

public void setNumLessons(int numLessons) {
	this.numLessons = numLessons;
}

public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}

}
