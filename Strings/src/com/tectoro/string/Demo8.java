package com.tectoro.string;

public class Demo8 
{
public static void main(String[] args)
{
	String s1="java";
	String s2=new String("JAVA");
	if(s1.equalsIgnoreCase(s2))
	{
		System.out.println(" Strings valus are equal: ");
	}
	else
	{
		System.out.println(" Strings valus are not equal: ");
	}
}
}
