package com.tectoro.array;

import java.util.Arrays;
import java.util.Scanner;

public class Cards 
{
public static void main(String[] args)
{
	/*
	Scanner sn=new Scanner(System.in);
	int n=sn.nextInt();
	int sum=0;
	int ar[]=new int[n-1];
	for(int i=0;i<ar.length;i++)
	{
		ar[i]=sn.nextInt();
		sum=sum+ar[i];
		System.out.println(sum);
	}
	int s=n*(2+(n-1)*2)/2;
	System.out.println(s);
	
	int mt=s-sum;
	System.out.println(mt);
	*/
	int arr[]= {1,5,3,9};
	Arrays.sort(arr);
	/*
	int tenp=0;
	for(int i=0;i<arr.length;i++)
	{
		for(int j=0;j<arr.length-1;j++)
		{
			if(arr[j]>=arr[j+1])
			{
				tenp=arr[j+1];
				arr[j+1]=arr[j];
				arr[j]=tenp;
			}
		}
	}
	*/
	for(int i=0;i<arr.length-1;i++)
	{
		if(arr[i]+2!=arr[i+1])
		{
			System.out.println(arr[i]+2);
		}
	}
}
}
