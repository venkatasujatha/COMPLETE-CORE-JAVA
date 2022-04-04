package com.tectoro.string;

import java.util.Scanner;

public class toCharArray
{
	static char[] toCharArray(String s)
	{
 char[] c=new char[s.length()];
 for(int i=0;i<s.length();i++)
 {
	c[i]=s.charAt(i);
 }
 return c;
}
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
     Scanner sn=new Scanner(System.in);
     String s=sn.nextLine();
     System.out.println(toCharArray(s));
	}
	}
