package com.tectoro.Pattern;

public class FiveStar4 
{
public static void main(String[] args)
{
	int i,j;
	for(i=1;i<=5;i++)
	{
		for(j=1;j<5-i+1;j++)
		{
			System.out.print(" * ");
		}
		System.out.println();
	}
}
}
