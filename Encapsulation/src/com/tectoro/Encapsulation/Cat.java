package com.tectoro.Encapsulation;

public class Cat
{
	private int energy=50;
	private int mood=53;
	private int hungry=50;
	
	public void sleep()
	{
		System.out.println("sleep");
		energy++;
		mood++;
	}
	public void play()
	{
		System.out.println("play");
		mood--;
		energy--;
	}
	public void feed()
	{
		System.out.println("feed");
		hungry++;
		energy--;
		meow();
	}
	public void meow()
	{
		System.out.println("meow");
	}
	public int getMood() 
	{
		return mood;
	}
	public int getHungry()
	{
		return hungry;
	}
	public int getEnergy()
	{
		return energy;
	}
}
