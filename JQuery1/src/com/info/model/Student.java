package com.info.model;

public class Student {
	private String name;
	private String roll;
	private String email;
	private String mobile;
	private String pass;
	public Student(String name,String roll,String email,String mobile,String pass)
	{
		this.name=name;
		this.roll=roll;
		this.email=email;
		this.mobile=mobile;
		this.pass=pass;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getRoll() {
		return roll;
	}
	public void setRoll(String roll) {
		this.roll = roll;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	public String getPass() {
		return pass;
	}
	public void setPass(String pass) {
		this.pass = pass;
	}
	
	

}
