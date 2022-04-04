package com.tectoro.jdbc;

public class Demo {

	public static void main(String[] args) 
	{
		 try
		 {
			 Class.forName("org.postgresql.Driver");
			 System.out.println("driver successfully loaded");
		 }
		 catch(ClassNotFoundException e)
		 {
			 e.printStackTrace();
		 }

	}

}
