package com.example.demo.entity;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
@Entity
@Table(name="coursedetails")
public class Coursedetails {
 @Id
 private int courseid;
 private String course;
public int getCourseid() {
	return courseid;
}
public void setCourseid(int courseid) {
	this.courseid = courseid;
}
public String getCourse() {
	return course;
}
public void setCourse(String course) {
	this.course = course;
}
public Coursedetails() {
	super();
	// TODO Auto-generated constructor stub
}
public Coursedetails(int courseid, String course) {
	super();
	this.courseid = courseid;
	this.course = course;
}
 
 
}
