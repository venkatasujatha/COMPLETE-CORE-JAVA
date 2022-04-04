package com.tectoro.Abstract;
import java.util.*;
 abstract class Employee 
{
  private String name;
  private int paymentPerHour;
  public Employee(String name,int paymentPerHour)
  {
	  this.name=name;
	  this.paymentPerHour=paymentPerHour;
  }
  public abstract int calculateSalary();
   public String getname()
    {
	  return name;
    }
  public void setName(String name)
    {

	this.name=name;	
    }
  public int getPaymentHour()
  {
	return paymentPerHour;
  }
  public void setPaymentPerHour(int PaymentPerHour)
  {

	this.paymentPerHour=paymentPerHour;	
  }
}
 	class contractor extends Employee
 	{
	 private int workingHours;

	 public contractor(String name,int PaymentPerHour,int workingHours)
	 {
		 super(name,PaymentPerHour);
		 this.workingHours=workingHours;
	 }
	 public int calculateSalary()
	 {
		 return getPaymentHour() * workingHours;
	 }
 	}
 	class FullTimeEmployee extends Employee
 	{
	 
 		public  FullTimeEmployee(String name,int paymentPerHour)
 		{
 			super(name, paymentPerHour);
	
 		}
 		public int calculateSalary()
 		{
 			return getPaymentHour() * 8; 
 		}
 	}


