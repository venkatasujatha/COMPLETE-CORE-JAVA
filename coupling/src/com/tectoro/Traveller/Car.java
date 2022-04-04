package com.tectoro.Traveller;

public class Car 
{
	public void move()
	{
		System.out.println("car is moving");
	}
}
class Bike extends Car
{
	public void move()
	{
		Car c=new Car();
		System.out.println("car is moving");
	}
}

