package com.tectoro.app;

abstract class Bike {
	abstract public void run();
	abstract public void stop();
	}
 class bus extends Bike
{
	public void run()
	{
		System.out.println(" bus is running....");
	}
	public void stop()
	{
		System.out.println(" bus is stoping....");
	}
}