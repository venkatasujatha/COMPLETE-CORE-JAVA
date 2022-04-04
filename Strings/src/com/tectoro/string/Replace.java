package com.tectoro.string;

import java.util.Scanner;

public class Replace 
{
static String replace(String str,char old_char,char new_char)
{
	char[] s=toCharArray(str);
	for(int i=0;i<s.length;i++)
	{
		if(s[i]==old_char)
		{
			s[i]=new_char;
		}
	}
	return new String(s);
}
	public static void main(String[] args)
	{

     Scanner sn=new Scanner(System.in);
     String str=sn.nextLine();
     char old_char=sn.next().charAt(0);
     char new_char=sn.next().charAt(0);
     System.out.println(replace(str,old_char,new_char));
     
	}

}
