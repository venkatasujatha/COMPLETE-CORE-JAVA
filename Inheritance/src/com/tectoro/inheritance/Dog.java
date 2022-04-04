package com.tectoro.inheritance;

public class Dog extends Animal
{
	private static void bark()
	{
		Animal a=new Animal();
		a.setId(123);
		System.out.println("Dog "+a.getId()+" is barking");
		//System.out.println();
	}
	

	public void sound()
	{
		
		bark();
	}
}
