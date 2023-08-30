package com.example.demo.model;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
@Entity
@Table(name="userdetails")
public class Userdetails {
	@Id
	 private int userid;
	private String name;
	private String city;
	private long mobile;
	private String emailid;
	public int getUserid() {
		return userid;
	}
	public void setUserid(int userid) {
		this.userid = userid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public long getMobile() {
		return mobile;
	}
	public void setMobile(long mobile) {
		this.mobile = mobile;
	}
	public String getEmailid() {
		return emailid;
	}
	public void setEmailid(String emailid) {
		this.emailid = emailid;
	}
	public Userdetails() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Userdetails(int userid, String name, String city, long mobile, String emailid) {
		super();
		this.userid = userid;
		this.name = name;
		this.city = city;
		this.mobile = mobile;
		this.emailid = emailid;
	}
	
}
