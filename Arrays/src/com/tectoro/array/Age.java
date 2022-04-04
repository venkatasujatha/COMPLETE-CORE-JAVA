package com.tectoro.array;
import java.util.*;
public class Age 
{
public static void main(String[] args)
{
	
	Scanner sn=new Scanner(System.in);
	System.out.println(" please enter the length of array1:");
	int n=sn.nextInt();
	System.out.println(" please enter the length of array2:");
	int y=sn.nextInt();
	int a[][]=new int[n][y];
for(int i=0;i<=a.length-1;i++)
	{
		 for(int j=0;j<=a[i].length-1;j++)
		{
			System.out.println(" enter the age ");
			 a[i][j]=sn.nextInt();
		}
	}
		System.out.println(" the ages are : ");
		for(int i=0;i<=a.length-1;i++)
		{
			for(int j=0;j<=a[i].length-1;j++)
			{
				System.out.print(a[i][j]+" ");
	}
			System.out.println();
}

}
}

