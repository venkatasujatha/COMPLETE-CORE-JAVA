package com.tectoro.Exception;
import java.util.*;
public class demo1 
{
 public void fun()throws Exception
{
	System.out.println(" connection2 is Estd ");
	Scanner sn=new Scanner(System.in);
	try {
		System.out.println(" enter the numerator ");
		int a=sn.nextInt();
		System.out.println(" enter denominator ");
		int b=sn.nextInt();
		int c=a/b;
		System.out.println(c);
		}
	catch(Exception e)
	{
		System.out.println(" Exception handled in fun() ");
		throw e;
	}
	System.out.println(" connection is terminated ");
}
}
