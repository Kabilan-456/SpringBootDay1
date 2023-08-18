package com.example.demo.model;

public class College {
	String collegeName; 
	String departmentName;
    int section;
	public String getCollegeName() {
		return collegeName;
	}
	public void setCollegeName(String collegeName) {
		this.collegeName = collegeName;
	}
	public String getDepartmentName() {
		return departmentName;
	}
	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}
	public int getSection() {
		return section;
	}
	public void setSection(int section) {
		this.section = section;
	}
	public College(String collegeName, String departmentName, int section) {
		super();
		this.collegeName = collegeName;
		this.departmentName = departmentName;
		this.section = section;
	}
	public College() {
		super();
		// TODO Auto-generated constructor stub
	}
    
}
