package com.tectoro.Stack;

public class stackOver 
{
	public static void main(String[] args)
	{
	
	   try
	   {
		Flow f1=new Flow();
		f1.Run();
	   }
	   catch(StackOverflowError e1)
	   {
			System.out.println("stack over flow error");
	   }
	}
}
