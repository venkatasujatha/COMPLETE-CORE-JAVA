package com.tectoro.string;

import java.util.Scanner;

public class NotEquals 
{
	
	static boolean equals(String s1,String s2)
	{
		if(s1.length()!=s2.length()) 
		{
			return false;
		}
		for(int i=0;i<s1.length();i++)
		{
			if(s1.charAt(i)!=s2.charAt(i))
			{
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
   Scanner sn=new Scanner(System.in);
 
   String s1=sn.nextLine();
   String s2=sn.nextLine();
   System.out.println(equals(s1,s2));
	}

}
