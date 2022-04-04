package com.tectoro.string;

import java.util.*;
public class LowerCase 
{
	static String toLowerCase(String s)
	{
		String t=" ";
		
		for(int i=0;i<s.length();i++)
		{
			char c=s.charAt(i);
			if(c>='A' && c<='Z')
			{
				 t=t+(char)(c+32);
			}
			else
			{
				t=t+c;
			}
			
		}
		return t;
	}
public static void main(String[] args)
{
	Scanner sn=new Scanner(System.in);
	String s=sn.nextLine();
	System.out.println(toLowerCase(s));
}
}
