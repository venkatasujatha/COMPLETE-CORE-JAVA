package com.tectoro.lamda;

import java.util.ArrayList;

interface run
{
	void add();
}
public class sumLamda 
{
	static int sum=0;
	public static void main(String[] args) 
	{
		ArrayList<Integer> a=new ArrayList<>();
		a.add(10);
		a.add(20);
		a.add(30);
		a.add(40);
		
		
		for(int b:a)
		{			
			run e=()->{
		
			sum=sum+b;
			
			System.out.println(sum);
		};
	
		e.add();
		}
		
		
	}
}

