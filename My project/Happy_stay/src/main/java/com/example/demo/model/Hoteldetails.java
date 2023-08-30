package com.example.demo.model;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
@Entity
@Table(name="hoteldetails")
public class Hoteldetails {
   @Id
   private int hotelid;
   private String hotelname;
   private String city;
   private int noofrooms;
   
   @ManyToOne(cascade = CascadeType.ALL)
   @JoinColumn(name="fk")
   private Userdetails ud;

public int getHotelid() {
	return hotelid;
}

public void setHotelid(int hotelid) {
	this.hotelid = hotelid;
}

public String getHotelname() {
	return hotelname;
}

public void setHotelname(String hotelname) {
	this.hotelname = hotelname;
}

public String getCity() {
	return city;
}

public void setCity(String city) {
	this.city = city;
}

public int getNoofrooms() {
	return noofrooms;
}

public void setNoofrooms(int noofrooms) {
	this.noofrooms = noofrooms;
}

public Userdetails getUd() {
	return ud;
}

public void setUd(Userdetails ud) {
	this.ud = ud;
}

public Hoteldetails() {
	super();
	// TODO Auto-generated constructor stub
}

public Hoteldetails(int hotelid, String hotelname, String city, int noofrooms, Userdetails ud) {
	super();
	this.hotelid = hotelid;
	this.hotelname = hotelname;
	this.city = city;
	this.noofrooms = noofrooms;
	this.ud = ud;
}
   
   
}
