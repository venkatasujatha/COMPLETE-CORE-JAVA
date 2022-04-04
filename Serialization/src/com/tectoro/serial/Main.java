package com.tectoro.serial;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Main {

	public static void main(String[] args) throws IOException
	{ 
		try
		{
		 Customer cus=new Customer("sujatha",2345,10000);
		 String path="/home/tectoro/sujatha/Notes.txt";
		 FileOutputStream fos = new FileOutputStream(path);
		 ObjectOutputStream oos=new ObjectOutputStream(fos);
		 oos.writeObject(cus);
		 oos.flush();
		}
		catch(FileNotFoundException ffe)
		{
			System.out.println();
	}
	}

}
