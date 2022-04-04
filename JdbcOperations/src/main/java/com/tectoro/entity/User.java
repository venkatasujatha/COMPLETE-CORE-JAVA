package com.tectoro.entity;

public class User {
	String ename;
	int sal;
	int phone;
	
	
	public User() {
		super();
		
	}
	public User(String ename, int sal, int phone) {
		
		this.ename = ename;
		this.sal = sal;
		this.phone = phone;
	//	System.out.println(ename);
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public int getSal() {
		return sal;
	}
	public void setSal(int sal) {
		this.sal = sal;
	}
	public int getPhone() {
		return phone;
	}
	public void setPhone(int phone) {
		this.phone = phone;
	}
	
	
	
	

}
