package com.example.demo.entity;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
@Entity
@Table(name = "bikedetails")
public class Bikedetails {
	@Id
     private int bikeid;
     private String regnumber;
     private String ownername;
     private int year;
     private String bikename;
     private String modelname;
	public int getBikeid() {
		return bikeid;
	}
	public void setBikeid(int bikeid) {
		this.bikeid = bikeid;
	}
	public String getRegnumber() {
		return regnumber;
	}
	public void setRegnumber(String regnumber) {
		this.regnumber = regnumber;
	}
	public String getOwnername() {
		return ownername;
	}
	public void setOwnername(String ownername) {
		this.ownername = ownername;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public String getBikename() {
		return bikename;
	}
	public void setBikename(String bikename) {
		this.bikename = bikename;
	}
	public String getModelname() {
		return modelname;
	}
	public void setModelname(String modelname) {
		this.modelname = modelname;
	}
	public Bikedetails() {
		// TODO Auto-generated constructor stub
	}
	public Bikedetails(int bikeid, String regnumber, String ownername, int year, String bikename, String modelname) {
		super();
		this.bikeid = bikeid;
		this.regnumber = regnumber;
		this.ownername = ownername;
		this.year = year;
		this.bikename = bikename;
		this.modelname = modelname;
	}
     
}
