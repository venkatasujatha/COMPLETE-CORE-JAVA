package com.tectoro.string;

public class DEmo14 
{
	public static void main(String[] args)
	{
		String s1="SACHIN";
		String s2="SAURAV";
		int result=s1.compareTo(s2);
		if(result==0)
		{
			System.out.println(" Strings are equal: ");
		}
		else if(result>0)
		{
			System.out.println(" String1 is greater than string2 ");
		}
		else
		{
			System.out.println("String1 is less than string2");
		}
	}

}
