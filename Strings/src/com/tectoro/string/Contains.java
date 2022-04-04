package com.tectoro.string;

import java.util.Scanner;

public class Contains 
{
   static boolean contains(String s,String t)
   {
	   int count=0;
	   for(int i=0;i<s.length()&&count<t.length();i++)
	   {
		   if(s.charAt(i)==t.charAt(count))
		   {
			   count++;
		   }
		   else
		   {
			   count=0;
		   }
	   }
		   if(t.length()==count)
		   {
			   return true;
		   }
		   else
		   {
			   return false;
		   }
	   
   }
	public static void main(String[] args) 
	{
		System.out.println("enter the string:");
     Scanner sn=new Scanner(System.in);
     String s=sn.next();
     String t=sn.next();
     System.out.println(contains(s,t));
     
	}

}
