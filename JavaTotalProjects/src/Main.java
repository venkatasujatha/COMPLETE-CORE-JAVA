

import java.util.*;
public class Main
{
    
	public static void main(String[] args) 
	{
	    Scanner sn=new Scanner(System.in);
		System.out.println("enter size of an array:");
		int n=sn.nextInt();
			int a[]=new int[n];
			System.out.println("enter numbers:");
		for(int i=0;i<a.length;i++)
		{
		    
		    a[i]=sn.nextInt();
		}	
		System.out.println("enter sum value");
		int c=sn.nextInt();
		System.out.println(sumPairs( a,c));
	}
	 static int sumPairs(int a[],int c)
    {
        int count=0;
        for(int i=0;i<a.length;i++)//1 2 3 4 5 
        {
            for(int j=0;j<a.length;j++)
            {
                if((a[i]+a[j])==c)
                {
                    count++;
                    System.out.println(a[i]+" "+a[j]);
                }
            }
            
        }
    return count;
}
}

