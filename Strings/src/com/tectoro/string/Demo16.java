package com.tectoro.string;

import java.util.StringTokenizer;

public class Demo16 
{
public static void main(String[] args)
{
	String s="JAVA PYTHON SQL AI";
	StringTokenizer st=new StringTokenizer(s," ");
	while(st.hasMoreTokens()==true)
	{
		System.out.println(st.nextToken());
	}
}
}
