package com.tectoro.composition;

public class LineItem 
{
	private int id;
	private int quantity;
	private Product p;
	public LineItem(int id,int quantity,Product p)
	{
		super();
		this.id=id;
		this.quantity=quantity;
		this.p=p;
	}
	public int getId()
	{
		return id;
	}
	public void setId(int id) 
	{
		this.id=id;
	}
	public int getQuantity()
	{
		return quantity;
	}
	public void setProduct(Product p)
	{
		this.p=p;
	}
	public Product getProduct()
	{
		return p;
	}
	public void setQuantity(int quantity)
	{
		this.quantity=quantity;
	}
	public String toString()
	{
		return "product[id="+id+",quantity="+quantity+",Product="+p+"]";
	}
	
}
