package com.tectoro.Operator;

import java.util.Scanner;

public class Operators {

	public static void main(String[] args) 
	{
		Scanner sn=new Scanner(System.in);
		
		
		System.out.println("choice are:");
		System.out.println(1);
		System.out.println(2);
		System.out.println(3);
		System.out.println(4);
		System.out.println("enter  Choice");
		int ch=sn.nextInt();
		
		switch(ch)
		{
			case 1:
				Add a1=new Add();
				System.out.println("enter first number ");
				int a=sn.nextInt();
				System.out.println("enter second number ");
				int b=sn.nextInt();
				
				a1.Add1(a,b);
			    System.out.println(" result: "+a1.c);
			    break;
			case 2:
				Sub b1=new Sub();
				System.out.println("enter first number ");
				 a=sn.nextInt();
				System.out.println("enter second number ");
				 b=sn.nextInt();
				
				b1.Sub1(a, b);
				System.out.println(" result: "+b1.c);
			    break;
			case 3:
				Mul m1=new Mul();
				System.out.println("enter first number ");
				 a=sn.nextInt();
				System.out.println("enter second number ");
				 b=sn.nextInt();
				m1.Mul1(a, b);
				System.out.println(" result: "+m1.c);
			    break;
			case 4:
				Div d1=new Div();
				System.out.println("enter first number ");
				 a=sn.nextInt();
				System.out.println("enter second number ");
				b=sn.nextInt();
				d1.Div1(a, b);
				System.out.println(" result: "+d1.c);
			    break;
			
			default:
				System.out.println(" Not valid ");
				
			   
				
		}
	}
}
