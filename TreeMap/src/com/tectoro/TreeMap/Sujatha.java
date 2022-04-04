package com.tectoro.TreeMap;

import java.util.Map.Entry;
import java.util.NavigableSet;
import java.util.Set;
import java.util.TreeMap;

public class Sujatha 
{
	public static void main(String[] args)
	{
	TreeMap<String,String> flights=new TreeMap<String,String>();
	flights.put("21:00","indigo");
	flights.put("23:30","goair");
	flights.put("04:30","Spicejet");
	flights.put("16:00","Vistara");
	flights.put("21:30","airindia");
	
	/*Set<Entry<String,String>> Entrys=flights.entrySet();
	for(Entry<String,String> e: Entrys)
	{
		System.out.println(e);
		System.out.println(flights.firstKey());
		System.out.println(flights.lastKey());
		System.out.println(flights.lastEntry());
		System.out.println(flights.ceilingKey("21:00"));
		System.out.println(flights.ceilingEntry("10:00"));
		System.out.println(flights.ceilingEntry("21:00"));
		System.out.println(flights.floorKey("10:00"));
		System.out.println(flights.floorEntry("10:00"));
		System.out.println(flights.higherKey("16:00"));
		System.out.println(flights.higherEntry("16:00"));
		System.out.println(flights.lowerEntry("16:00"));
		System.out.println(flights.lowerKey("16:00"));
		
	}*/
	NavigableSet<String,String> keys=flights.descendingKeySet();
}
}
