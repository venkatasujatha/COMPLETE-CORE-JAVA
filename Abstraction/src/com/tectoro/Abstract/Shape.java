package com.tectoro.Abstract;

public class Shape 
{
  public static void main(String[] args)
  {
	  Demo s1=new circle("red",2);
	  Demo s2=new Rectangle("yellow",3,4);
	  System.out.println(s1.toString());
	  System.out.println(s2.toString());
  }
}
