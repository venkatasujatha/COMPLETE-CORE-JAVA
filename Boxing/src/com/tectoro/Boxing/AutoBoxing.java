package com.tectoro.Boxing;

public class AutoBoxing 
{
	public static void main(String[] args)
	{
		int a=99;
		Integer b=new Integer(a);
		System.out.println(b);
		
		byte c=100;
		Byte d=new Byte(c);
		System.out.println(d);
		
		short e=100;
		Short f=new Short(e);
		System.out.println(f);
		
		long l=200;
		Long L=new Long(l);
		System.out.println(L);
		
		double d1=10;
		Double D=new Double(d1);
		System.out.println(D);
		
		float f1=29.3f;
		Float t=new Float(f1);
		System.out.println(t);
		
		char c1='a';
		Character x=new Character(c1);
		System.out.println(x);
		
		boolean n=true;
		Boolean n1=new Boolean(n);
		System.out.println(n1);
				
		
	}
}
