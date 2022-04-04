package com.tectoro.string;

import java.util.Scanner;

public class Demo22 
{
static int indexOf(String s,String c)
{
	char key=c.charAt(0);
	for(int i=0;i<s.length();i++)
	{
		if(s.charAt(i)==key)
		{
			return i;
		}
	}
	return -1;
}

public static void main(String args[])
{
	Scanner sn=new Scanner(System.in);
	System.out.println("enter a String ");
	String s=sn.nextLine();
	System.out.println("enter a character ");
	String c=sn.nextLine();
	System.out.println(indexOf(s,c));
	}
}