
package com.tectoro.lamda;

import java.util.function.Function;

public class Predicate {

	public static void main(String[] args) 
	{
		Predicate p= j->j%2==0;
		
		System.out.println(p.test(4));
		System.out.println(p.test(6));

	}

}
