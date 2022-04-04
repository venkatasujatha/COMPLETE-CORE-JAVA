package com.tectoro.Exception;

public class Exception1 {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
System.out.println(" connection1 is Estd ");
try {
	demo1 d1=new demo1();
	d1.fun();
}
catch(Exception e)
{
	System.out.println(" exception handled in main ");
}
finally
{
	System.out.println(" connection is terminated ");
}
System.out.println(" connection1 is terminated ");
	}

}
