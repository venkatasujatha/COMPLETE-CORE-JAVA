package com.tectoro.serial;

import java.io.Serializable;

public class Customer implements Serializable
{
	private String name;
	private long crn;
	private float balance;
	public Customer(String name,long crn,float balance)
	{
		super();
		this.name=name;
		this.crn=crn;
		this.balance=balance;
	}
	public String getName()
	{
		
		return name;
	}
	public String setName(String name)
	{
		return this.name=name;
	}
	public long getCrn() {
		return crn;
	}
	public void setCrn(long crn) {
		this.crn = crn;
	}
	public float getBalance() {
		return balance;
	}
	public void setBalance(float balance) {
		this.balance = balance;
	}
	
	public String toString() {
		return "Customer [name=" + name + ", crn=" + crn + ", balance=" + balance + "]";
	}
	
}
