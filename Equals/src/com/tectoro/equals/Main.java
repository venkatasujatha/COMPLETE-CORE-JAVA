package com.tectoro.equals;

import java.util.HashSet;

public class Main {

	public static void main(String[] args) 
	{
		Employee e1=new Employee();
		e1.Employee(1, "sujatha");
		Employee e2=new Employee();
		e2.Employee(1, "sujatha");
		System.out.println((e1==e2));
		System.out.println((e1.equals(e2)));
		
		HashSet<Employee> employees=new HashSet<>();
		employees.add(e1);
		employees.add(e2);
		System.out.println(employees);
	}

}
