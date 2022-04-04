package com.tectoro.serial;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Deserial {

	public static void main(String[] args) throws ClassNotFoundException  
	{
		try
		{
		String path="/home/tectoro/sujatha/Notes.txt";
		FileInputStream fie=new FileInputStream(path);
		ObjectInputStream oie=new ObjectInputStream(fie);
		Customer cus1=(Customer)oie.readObject();
		System.out.println(cus1.getName());
		System.out.println(cus1.getCrn());
		System.out.println(cus1.getBalance());
		
		}
		catch (FileNotFoundException e) 
		{
			e.printStackTrace();
		}
		catch (IOException e) 
		{
			e.printStackTrace();
		}
	}
}


