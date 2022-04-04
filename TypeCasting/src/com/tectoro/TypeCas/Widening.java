package com.tectoro.TypeCas;

public class Widening
{
public static void main(String[] args)
{
	int x=10;
	long y=x;
	float z=y;
	
	System.out.println(" before widening...."+x);
	System.out.println(" after widening...."+y);
	System.out.println(" after widening...."+z);
}
}
