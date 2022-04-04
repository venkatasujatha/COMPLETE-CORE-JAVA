package com.tectoro.string;

public class Demo10 
{
public static void main(String[] args)
{
	String s1="JAVA";
	String s2="PYTHON";
	String s3="JAVA"+"PYTHON";
	String s4="JAVA"+"PYTHON";
	if(s3==s4)
	{
	System.out.println(" References are equal: ");	
	}
	else
	{
		System.out.println(" References are not equal: ");
	}
}
}
