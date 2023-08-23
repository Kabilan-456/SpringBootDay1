package com.example.demo.model;

import java.sql.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="CustomerDetails")
public class CustomerDetails {
    @Id
    private int cust_id;
    private String cust_name;
    private String room_type;
    private long ph_no;
    private int no_of_days;
    private double amount;
    private Date day_in;
    private Date day_out;
	public int getCust_id() {
		return cust_id;
	}
	public void setCust_id(int cust_id) {
		this.cust_id = cust_id;
	}
	public String getCust_name() {
		return cust_name;
	}
	public void setCust_name(String cust_name) {
		this.cust_name = cust_name;
	}
	public String getRoom_type() {
		return room_type;
	}
	public void setRoom_type(String room_type) {
		this.room_type = room_type;
	}
	public long getPh_no() {
		return ph_no;
	}
	public void setPh_no(long ph_no) {
		this.ph_no = ph_no;
	}
	public int getNo_of_days() {
		return no_of_days;
	}
	public void setNo_of_days(int no_of_days) {
		this.no_of_days = no_of_days;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	public Date getDay_in() {
		return day_in;
	}
	public void setDay_in(Date day_in) {
		this.day_in = day_in;
	}
	public Date getDay_out() {
		return day_out;
	}
	public void setDay_out(Date day_out) {
		this.day_out = day_out;
	}
	public CustomerDetails() {
		super();
		// TODO Auto-generated constructor stub
	}
	public CustomerDetails(int cust_id, String cust_name, String room_type, long ph_no, int no_of_days, double amount,
			Date day_in, Date day_out) {
		super();
		this.cust_id = cust_id;
		this.cust_name = cust_name;
		this.room_type = room_type;
		this.ph_no = ph_no;
		this.no_of_days = no_of_days;
		this.amount = amount;
		this.day_in = day_in;
		this.day_out = day_out;
	}
    
	
    
}
