package com.tectoro.string;

import java.util.Scanner;

public class LastOcc 
{
  static int lastIndexOf(String s,String c)
  {
	  
	  int s1=s.length()-1;
	for(int i=s1;i>=0;i--)
	{
		char key1=c.charAt(0);		
		
		if(s.charAt(i)==key1)
		{
			
			return i;
		}
		
	}
	return -1;
	
  }
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
    Scanner sn=new Scanner(System.in);
    String s=sn.nextLine();
    String c=sn.next();
    System.out.println(LastOcc.lastIndexOf(s,c));
	}

}
