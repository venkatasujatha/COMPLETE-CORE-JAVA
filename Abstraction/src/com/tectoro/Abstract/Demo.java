package com.tectoro.Abstract;

abstract class Demo 
{
  protected String color;
  abstract double area();
  public abstract String toString();
  public Demo(String color)
  {
	System.out.println(" demo constructor called "); 
	this.color=color;
  }
  public String getColor()
  {
	  return color;
  }
}
class circle extends Demo
{
	double radius;
	public circle(String color,double radius)
	{
		super(color);
		System.out.println(" circle constructor called ");
		this.radius=radius;
	}
	double area()
	{
		return Math.PI*Math.pow(radius,2);
	}
	public String toString()
	{
		return "circle color is"+super.color+"and area is"+area();
	}
	
}
class Rectangle extends Demo
{
	double length;
	double width;

public Rectangle(String color, double length, double width)
{
	super(color);
	System.out.println(" rectangle constructor called ");
	this.length=length;
	this.width=width;	
}
    double area()
    {
    	return length*width;
    }
    public String toString()
    {
    	return "Rectangle color is"+""+super.color+"and area is"+area();
    }
}

