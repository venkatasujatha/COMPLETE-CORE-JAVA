package com.tectoro.string;

import java.util.StringTokenizer;

public class Demo18 
{
public static void main(String[] args)
{
	String s="JAVA PYTHON SQL AI";
	StringTokenizer st=new StringTokenizer(s,"A");
	while(st.hasMoreTokens()==true)
	{
		System.out.println(st.nextToken());
	}
}
}