package com.tectoro.string;

public class DEmo13 
{
	public static void main(String[] args)
	{
		String s1="JAVA";
		String s2="PYTHON";
		String s3=s1.concat(s2);
		String s4=s1.concat(s2);
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
