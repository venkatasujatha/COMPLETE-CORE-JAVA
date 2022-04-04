package com.tectoro.Immutable;

public class Immutable {

	public static void main(String[] args) 
	{
		Plane p=new Plane("Indigo");
		System.out.println(p.getPlane());
         p=new Plane("airLine");
        System.out.println(p.getPlane());
        Plane p1=new Plane("Indigo");
        System.out.println(p1.getPlane());
        
        if(p==p1)
        {
        	System.out.println("References are same");
        }
        else
        {
        	System.out.println("References are not same");	
        }
        if(p.getPlane().equals(p1.getPlane())) 
        {
        	System.out.println("values are same");
        }
        else
        {
        	System.out.println("values are not same");
        }
	}

	}


