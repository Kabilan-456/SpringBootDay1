package com.example.demo.entity;

import java.sql.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="bookingdetails")
public class Bookingdetails {
@Id
private int id;
private String custname;
private String city;
private String hotel;
private int noofrooms;
private String roomtype;
private Date dayin;
private Date dayout;
private long phno;
private String mailid;

public String getCustname() {
	return custname;
}
public void setCustname(String custname) {
	this.custname = custname;
}
public String getCity() {
	return city;
}
public void setCity(String city) {
	this.city = city;
}
public String getHotel() {
	return hotel;
}
public void setHotel(String hotel) {
	this.hotel = hotel;
}
public int getNoofrooms() {
	return noofrooms;
}
public void setNoofrooms(int noofrooms) {
	this.noofrooms = noofrooms;
}
public String getRoomtype() {
	return roomtype;
}
public void setRoomtype(String roomtype) {
	this.roomtype = roomtype;
}
public Date getDayin() {
	return dayin;
}
public void setDayin(Date dayin) {
	this.dayin = dayin;
}
public Date getDayout() {
	return dayout;
}
public void setDayout(Date dayout) {
	this.dayout = dayout;
}
public long getPhno() {
	return phno;
}
public void setPhno(long phno) {
	this.phno = phno;
}
public String getMailid() {
	return mailid;
}
public void setMailid(String mailid) {
	this.mailid = mailid;
}
public Bookingdetails() {
	// TODO Auto-generated constructor stub
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public Bookingdetails(int id, String custname, String city, String hotel, int noofrooms, String roomtype, Date dayin,
		Date dayout, long phno, String mailid) {
	super();
	this.id = id;
	this.custname = custname;
	this.city = city;
	this.hotel = hotel;
	this.noofrooms = noofrooms;
	this.roomtype = roomtype;
	this.dayin = dayin;
	this.dayout = dayout;
	this.phno = phno;
	this.mailid = mailid;
}



}
