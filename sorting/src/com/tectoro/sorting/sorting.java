package com.tectoro.sorting;

import java.util.Scanner;

public class sorting 
{
	public static void main(String[] args)
	{
		//Scanner sn=new Scanner(System.in);
		//System.out.println("enter the array");
		int a[]= {60,40,9,1,20};
		int b[]=new int[a.length];
		/*int small=a[0];
		for(int i=0;i<a.length;i++)
		{
				
				if(small>a[i])
				{
					 small = a[i];
					
				}
			
		}
		System.out.println(small);*/
		for(int i=0;i<b.length;i++)
		{
		 b[i]=a[a.length-1-i];
		 System.out.println("position"+i+" "+b);
		}
	}
}
     