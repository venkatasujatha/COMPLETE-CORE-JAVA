package com.tectoro.TypeCas;

public class Narrow 
{
public static void main(String[] args)
{
	int i=3;
	long x=10;
	int y=(int)x;
	double d=10.90;
	float f=(float)10.90;
	
	String s=" sujatha ";
	/*
	 * for(i=0;i<s.length()-1;i++) { char c1=s.charAt(i); }
	 */
	System.out.println("char at "+i+" index "+s.charAt(i));
	System.out.println(" "+y);
	System.out.println(" "+f);
}
}
