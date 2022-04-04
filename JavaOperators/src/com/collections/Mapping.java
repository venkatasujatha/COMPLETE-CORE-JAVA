package com.collections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Stack;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.Vector;

public class Mapping {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<Integer, String> m= new HashMap<Integer, String>();
		m.put(1,"sujatha");
		m.put(2,"sameera");
		m.put(3,null);
		m.put(4, null);
		m.put(5, null);
		m.put(null, "naresh");
		m.put(null, "naveen");
		m.put(null, null);
		System.out.println(m);
		
		/*
		 * for(Map.Entry l:m.entrySet()) {
		 * System.out.println(l.getKey()+" : "+l.getValue());
		 * 
		 * }
		 */
	Map<Integer,String> m1=new TreeMap<Integer, String>();
	//m1.put(null, null);
	//m1.put(null, null);
	m1.put(1, "szaujatha");
	m1.put(2, "parveen");
	System.out.println(m1);
	/*
	 * for(Map.Entry l1:m1.entrySet()) {
	 * System.out.println(l1.getKey()+": "+l1.getValue()); }
	 */
	
	List<String> list=new ArrayList<String>();
	list.add("naresh");
	list.add("naresh");
	list.add(null);
	list.add(null);
	list.add(null);
	list.add("naveen");
	System.out.println(list);
	/*
	 * for(String list1:list) { System.out.println(list1);
	 * 
	 * }
	 */
	
	List<String> w1=new LinkedList<String>();
	w1.add("naresh");
	w1.add("naresh");
    w1.add(null);
	w1.add(null);
	w1.add(null);
	w1.add("naveen");
	System.out.println(w1);
	
	List<String> v=new Vector<String>();
	v.add("naresh");
	v.add("naresh");
    v.add(null);
	v.add(null);
	v.add(null);
	v.add("naveen");
	v.add(null);
	v.add(null);
	System.out.println(v);
	
	List<String> s=new Stack<String>();
	s.add("naresh");
	s.add("naresh");
    s.add(null);
	s.add(null);
	s.add(null);
	s.add("naveen");
	System.out.println(s);
	
	Set<String> t=new TreeSet<String>();
	t.add("b");
	t.add("naresh");
	t.add("naresh");
   // t.add(null);
	//t.add(null);
	//t.add(null);
	t.add("naveen");
	t.add("naveen");
	t.add("naveen");
	t.add("a");
	System.out.println(t);
	
	Set<String> ls=new LinkedHashSet<String>();
	ls.add("b");
	ls.add("naresh");
	ls.add("naresh");
    ls.add(null);
	ls.add(null);
	ls.add(null);
	ls.add("naveen");
	ls.add("a");
	System.out.println(ls);
	
	Set<String> ht=new HashSet<String>();
	
	ht.add("n");
	ht.add("a");
	ht.add(null);
	ht.add(null);
	ht.add("r");
	ht.add(null);
	ht.add("a");
	ht.add("b");
	ht.add("z");
	System.out.println(ht);
	
	
	
	
	
	
	
	
		

	}

}
