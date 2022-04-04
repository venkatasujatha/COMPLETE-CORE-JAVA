package com.tectoro.string;
import java.util.*;
public class Trim 
{
  static String trim(String s)
  {
	  String t="";
	  int si=0;
	  int ei=0;
	  for(int i=0;i<s.length();i++)
	  {
		  if(s.charAt(i)!=' ')
		  {
			  si=i;
			  break;
		  }
	  }
	  for(int i=s.length()-1;i>=0;i--)
	  {
		  if(s.charAt(i)!=' ')
		  {
			  ei=i;
			  break;
		  }
	  }
	  for(int i=si;i<=ei;i++)
	  {
		  t=t+s.charAt(i);
	  }
	  return t;
  }
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
     Scanner sn=new Scanner(System.in);
     String s=sn.nextLine();
     System.out.println(trim(s));
	}

}
