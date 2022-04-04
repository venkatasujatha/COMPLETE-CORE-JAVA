package com.tectoro.app;

public class MainInter 
{
public static void main(String[] args)
{
	Bank b1=new AndhraBank();
	Bank b2=new RBI();
	Bank b3=new SBI();
	System.out.println(" Rate of : "+b1.RateOfInterest());
	System.out.println(" Rate of : "+b2.RateOfInterest());
	System.out.println(" Rate of : "+b3.RateOfInterest());
	
}
}
