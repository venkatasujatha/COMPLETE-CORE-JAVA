package com.tectoro.array;

import java.util.Arrays;
import java.util.Scanner;

public class DivisibleSum 
{
	
static int divisibleSumPair(int ar[],int k)
{
	int count=0;

	System.out.println(Arrays.toString(ar));
	for(int i=0;i<ar.length-1;i++)
	{
		for(int j=i+1;j<ar.length;j++)
		{

			if((ar[i]+ar[j])%k==0)
			{
				count++;
				System.out.println(count);

			}
 		}

	}
 
	return count;

}


public static void main(String[] args)
{
	DivisibleSum d=new DivisibleSum();
	
	Scanner sn=new Scanner(System.in);
	
	System.out.println("enter length");
	 	int n=sn.nextInt();
		System.out.println("enter number k =");

		int k=sn.nextInt();
		int ar[]=new int[n];
		for(int i=0;i<ar.length;i++) 
		{
			System.out.println("enter elements");

			ar[i]=sn.nextInt();
		}
		System.out.println(Arrays.toString(ar));

	int arr[]=new int[n];
	d.divisibleSumPair(arr,k);
    
}
}

