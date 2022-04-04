package com.tectoro.Encapsulation;

public class Encapsulation {

	public static void main(String[] args) 
	{
	  Cat c=new Cat();
	  c.feed();
	  c.play();
	  c.sleep();
	  System.out.println("energy"+c.getEnergy());
	  System.out.println("mood"+c.getMood());
	  System.out.println("hungry"+c.getHungry());

	}

}
