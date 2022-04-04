package com.tectoro.synch;

class Test
{

public static void main(String[] args) 
{
	System.out.println("main");
	Sujatha t=new Sujatha();
	Thread t1=new Thread(t);
	Thread t2=new Thread(t);
	t1.setName("one");
	t1.setName("two");
	t1.start();
	t2.start();
	System.out.println(" completed");
}
}
