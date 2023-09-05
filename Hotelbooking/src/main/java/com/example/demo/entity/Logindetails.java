package com.example.demo.entity;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="logindetails")
public class Logindetails {
@Id

private int id;
private String username;
private String password; 


public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getUsername() {
	return username;
}
public void setUsername(String username) {
	this.username = username;
}
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}
public Logindetails() {
	// TODO Auto-generated constructor stub
}
public Logindetails( int id, String username, String password) {
	super();
	this.id = id;
	this.username = username;
	this.password = password;
}

}
