
import java.util.*;
public class Main
{
    
	public static void main(String[] args) 
	{
	    Scanner sn=new Scanner(System.in);
		System.out.println("enter size of an array:");
		int n=sn.nextInt();
		//System.out.println(n);
			int a[]=new int[n];
			System.out.println("enter numbers:");
			System.out.println("jjhjh"+a.length);
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
        for(int i=0;i<a.length;i++)
        {
            for(int j=i+1;j<a.length;j++)
            {
                if((a[i]+a[j])==c)
                {
                    count++;
                }
            }
            
        }
    return count;
}
}

