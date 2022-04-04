package com.tectoro.lamda;

import java.util.ArrayList;
interface run1
{
	public void call();
}
public class Printallelements 
{
	public static void main(String[] args) 
	{
		ArrayList ae=new ArrayList();
		ae.add(10);
		ae.add("sujatha");
		ae.add(30);
		ae.add(40);
		ae.add(50);
		 for(Object se:ae)
		{
			run1 a=()->System.out.println(se);
			a.call();
		}
		

	}

}
