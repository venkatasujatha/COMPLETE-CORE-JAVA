package com.tectoro.lamda;

import java.util.ArrayList;
import java.util.List;

public class Element {

	public static void main(String[] args) 
	{
		/*List<Integer> list=new ArrayList<Integer>();
		list.add(20);
		list.add(10);
		list.add(11);
		list.add(2);
		list.add(13);
		System.out.println("Array List::");
		list.forEach(i -> System.out.println(i));
	
		int total = list.stream().mapToInt(i -> i.intValue()).sum();
        System.out.println(total);*/
        
        List<String> list2=new ArrayList<String>();
        list2.add("abbb");
        list2.add("banny");
        list2.add("ckj");
        list2.add("akil");
        list2.add("dog");
        list2.add("ravi");
        list2.add("sujatha");
        list2.add("karthik");
        list2.stream().filter(i -> i.toString().startsWith("a")).forEach(System.out::println);

	}

}
