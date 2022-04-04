package com.tectoro.string;

import java.util.Scanner;

public class StartsWith
{
  static boolean startsWith(String s,String t)
  {
	  int count=0;
	  for(int i=0;i<t.length();i++)
	  {
	  if(s.charAt(i)==t.charAt(count))
	  {
		 count++; 
	  }
	  if(t.length()==count)
	  {
		  return true;
	  }
		  
  }
	  return false;
  } 
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
     Scanner sn=new Scanner(System.in);
     String s=sn.nextLine();
     String t=sn.nextLine();
     System.out.println(startsWith(s,t));
	}

}
