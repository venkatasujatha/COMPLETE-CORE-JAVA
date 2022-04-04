package com.tectoro.ArrayList;
import java.util.ArrayList;
public class ADD {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ArrayList al=new ArrayList();
al.add(10);
al.add(20);
al.add(30);
System.out.println(al);
al.add(2,33);
System.out.println(al);
ArrayList b=new ArrayList();
b.add(100);
b.add(200);
b.add("string");
al.remove(2);
System.out.println(b);
al.addAll(2,b);
al.set(2,78);
al.remove(new Integer(20));
System.out.println(al);
System.out.println(al.get(2));
System.out.println(al.subList(0, 2));
System.out.println(al.indexOf(30));
System.out.println(al.lastIndexOf(20));
	}

}
