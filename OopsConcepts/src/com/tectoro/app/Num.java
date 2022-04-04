package com.tectoro.app;

public class Num {
	int i,sum=0;
	public void add()
	{
		sum=sum+i;
		System.out.println(" sum details: ");
	}
	public void add(int k,String Name)
	{
		System.out.println("Print details : ");
	}
}
class sub extends Num
{
	public void add(int k,String Name,int j)
	{
		System.out.println(" Print details : ");
	}
}