package com.tectoro.lamda;

import java.util.function.Function;
import java.util.function.Predicate;

public class Functional {

	public static void main(String[] args) 
	{
		Predicate<Integer> p= j->j%2==0;
		Function<Integer,Integer> f=j->j+j;
		System.out.println("the addition is"+f.apply(30));
		System.out.println("the addition is"+f.apply(70));

	}

}
