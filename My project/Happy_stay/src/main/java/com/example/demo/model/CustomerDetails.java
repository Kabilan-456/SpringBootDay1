package com.example.demo.model;

import java.sql.Date;

import com.fasterxml.jackson.annotation.JsonProperty;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.transaction.Transactional;

@Entity
@Table(name="customerdetail")
@Transactional
public class CustomerDetails {
    @Id
    private int custid;
    private String custname;
    private String roomtype;
    private long phno;
    private int noofdays;
    private double amount;
    private Date dayin;
    private Date dayout;
	public int getCustid() {
		return custid;
	}
	public void setCustid(int custid) {
		this.custid = custid;
	}
	public String getCustname() {
		return custname;
	}
	public void setCustname(String custname) {
		this.custname = custname;
	}
	public String getRoomtype() {
		return roomtype;
	}
	public void setRoomtype(String roomtype) {
		this.roomtype = roomtype;
	}
	public long getPhno() {
		return phno;
	}
	public void setPhno(long phno) {
		this.phno = phno;
	}
	public int getNoofdays() {
		return noofdays;
	}
	public void setNoofdays(int noofdays) {
		this.noofdays = noofdays;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
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
	public CustomerDetails() {
		// TODO Auto-generated constructor stub
	}
	public CustomerDetails(int custid, String custname, String roomtype, long phno, int noofdays, double amount,
			Date dayin, Date dayout) {
		super();
		this.custid = custid;
		this.custname = custname;
		this.roomtype = roomtype;
		this.phno = phno;
		this.noofdays = noofdays;
		this.amount = amount;
		this.dayin = dayin;
		this.dayout = dayout;
	}
	
}
