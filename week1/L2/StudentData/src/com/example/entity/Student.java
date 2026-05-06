package com.example.entity;

import java.util.ArrayList;

public class Student {
	
	int rollNo;
	String name;
	String education;
	
	
	public Student(int rollNo, String name, String education) {
		super();
		this.rollNo = rollNo;
		this.name = name;
		this.education = education;
	}
	public int getRollNo() {
		return rollNo;
	}
	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEducation() {
		return education;
	}
	public void setEducation(String education) {
		this.education = education;
	}
	@Override
	public String toString() {
		return "rollNo=" + rollNo + ", name=" + name + ", education=" + education ;
	}
	
	
	
	

}
