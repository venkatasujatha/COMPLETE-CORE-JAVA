package com.tectoro.composition;

public class Product 
{
	private int id;
	private String name;
	private String Description;
	public Product(int id,String name,String Description)
	{
		super();
		this.id=id;
		this.name=name;
		this.Description=Description;
	}
	public int getId()
	{
		return id;
	}
	public void setId(int id) 
	{
		this.id=id;
	}
	public String getName()
	{
		return name;
	}
	public void setName(String name)
	{
		this.name=name;
	}
	public String getDescription()
	{
		return Description;
	}
	public void setDescription(String Description)
	{
		this.Description=Description;
	}
	public String toString()
	{
		return "product[id="+id+",name="+name+",Description="+Description+"]";
	}
	
}
