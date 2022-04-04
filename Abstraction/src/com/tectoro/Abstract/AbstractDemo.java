package com.tectoro.Abstract;

public class AbstractDemo {

	public static void main(String[] args) 
	{
	Employee contractor=new contractor("contractor",10,10);
	Employee FullTimeEmployee=new FullTimeEmployee(" full time employee ",8);
	System.out.println(contractor.calculateSalary());
	System.out.println(FullTimeEmployee.calculateSalary());

	}

}
