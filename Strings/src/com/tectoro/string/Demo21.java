package com.tectoro.string;

import java.util.*;
import java.lang.*;
class Demo21
{
	static  String toUpperCase(String s)
	{
		String t=" ";
		for(int i=0;i<s.length();i++)
		{
		char c=s.charAt(i);
		if(c>='a'&&c<='z')
		{
		 t=t+(char)(c-32);
		}
		else
		{
		 t=t+c;
			
		}
		return t;
		}
	}
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
	  Scanner sn=new Scanner(System.in);
	  System.out.println(" enter a string ");
	  String s=sn.nextLine();
	  System.out.println(toUpperCase(s));
	}
}
	