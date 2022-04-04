package com.tectoro.synch;
import java.util.*;
public class Sujatha implements Runnable
{
	public synchronized void run()
	{
		try {
			String Name=Thread.currentThread().getName();
			System.out.println(Name+" executing first Line ");
			Thread.sleep(1000);
			System.out.println(Name+" executing second Line ");
         Thread.sleep(1000);
			synchronized(this)
			{
				System.out.println(Name+" executing third Line ");
						Thread.sleep(1000);
						System.out.println(Name+" executing fourth Line ");
			         Thread.sleep(1000);
			}
			System.out.println(Name+" executing fifth Line ");
					Thread.sleep(1000);
					System.out.println(Name+" executing sixth Line ");
		         Thread.sleep(1000);
					System.out.println(Name+" executing seventh Line ");
							Thread.sleep(1000);
							System.out.println(Name+" executing eighth Line ");
				         Thread.sleep(1000);
		}
		catch(Exception e)
		{
			System.out.println("some problem executed");
		}
	}
}


