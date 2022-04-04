package com.tectoro.equals;

public class Employee 
{
	private int id;
	private String name;
	public void Employee(int id,String name)
	{
		this.id=id;
		this.name=name;
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
	public boolean equals(Object o)
	{
		if(o==null)
		{
			return false;
		}
		if(o==this)
		{
			return true;
		}
		if(getClass()!=o.getClass())
		{
			return false;
		}
		Employee e=(Employee)o;
		if(id!=e.id)
		{
			return false;
		}
		if(name==null)
		{
			if(e.name!=null)
			{
				return false;
			}
		}
		else if(!name.equals(e.name))
		return false;
		return true;
	}
	
	public int hashCode()
	{
		final int prime=17;
		int res=1;
		res=prime*res+id;
		res=prime*res+((name==null)?0:name.hashCode());
		return res;
	}
	
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + "]";
	}

	}


