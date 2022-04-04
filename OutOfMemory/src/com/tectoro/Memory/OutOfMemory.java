package com.tectoro.Memory;

public class OutOfMemory 
{

	public static void main(String[] args) 
	{
		try
		{
		Array a1=new Array();
		a1.sony();
		}
		catch (OutOfMemoryError e) {
			System.out.println("error handled");
		}
	}


	}


