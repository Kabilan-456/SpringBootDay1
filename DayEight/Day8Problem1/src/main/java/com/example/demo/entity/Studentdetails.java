package com.example.demo.entity;
import java.util.List;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
@Entity
@Table(name="studentdetails")
public class Studentdetails {
@Id
private int id;
private String name;
private String stream;
@OneToMany(cascade = CascadeType.ALL)
@JoinColumn(name="fk_courseid")
private List<Coursedetails> cd;

public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getStream() {
	return stream;
}
public void setStream(String stream) {
	this.stream = stream;
}
public List<Coursedetails> getCd() {
	return cd;
}
public void setCd(List<Coursedetails> cd) {
	this.cd = cd;
}
public Studentdetails() {
	super();
	// TODO Auto-generated constructor stub
}
public Studentdetails(int id, String name, String stream, List<Coursedetails> cd) {
	super();
	this.id = id;
	this.name = name;
	this.stream = stream;
	this.cd = cd;
}



}
