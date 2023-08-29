package com.example.demo.entity;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
@Entity
@Table(name = "cardetails")
public class Cardetails {
   @Id
    private int id;
   private String carname;
   private String cartype;
   private int owners;
   private String currentownername;
   private Long mobile;
   private String address;
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getCarname() {
	return carname;
}
public void setCarname(String carname) {
	this.carname = carname;
}
public String getCartype() {
	return cartype;
}
public void setCartype(String cartype) {
	this.cartype = cartype;
}
public int getOwners() {
	return owners;
}
public void setOwners(int owners) {
	this.owners = owners;
}
public String getCurrentownername() {
	return currentownername;
}
public void setCurrentownername(String currentownername) {
	this.currentownername = currentownername;
}
public Long getMobile() {
	return mobile;
}
public void setMobile(Long mobile) {
	this.mobile = mobile;
}
public String getAddress() {
	return address;
}
public void setAddress(String address) {
	this.address = address;
}
public Cardetails() {
	super();
	// TODO Auto-generated constructor stub
}
private Cardetails(int id, String carname, String cartype, int owners, String currentownername, Long mobile, String address) {
	super();
	this.id = id;
	this.carname = carname;
	this.cartype = cartype;
	this.owners = owners;
	this.currentownername = currentownername;
	this.mobile = mobile;
	this.address = address;
}
   
}
