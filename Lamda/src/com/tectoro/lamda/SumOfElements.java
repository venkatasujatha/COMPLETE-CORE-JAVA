package com.tectoro.lamda;

import java.util.ArrayList;
import java.util.Scanner;
interface Plain
{
	public int fun(ArrayList<Integer> x);
}
public class SumOfElements {

	public static void main(String[] args) 
	{
		Scanner sn=new Scanner(System.in);
		int a=sn.nextInt();
		ArrayList<Integer> as=new ArrayList<Integer>();
		for(int i=0;i<a;i++)
		{
			int n=sn.nextInt();
			as.add(n);
			
		}
		Plain fr=(x)->{
			int sum=0;		
			for(int j=0;j<a;j++)
			{
				sum=sum+as.get(j);
			}
			return sum;
		};
		System.out.println(fr.fun(as));
	}

}
