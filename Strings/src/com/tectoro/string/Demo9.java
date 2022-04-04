package com.tectoro.string;

public class Demo9 
{
public static void main(String[] args)
{
	String s1="JAVA";
	String s2;
	s2=s1;
	if(s1==s2)
	{
		System.out.println("References are equal");
	}
	else
	{
		System.out.println("References are not equal");
	}
}
}
