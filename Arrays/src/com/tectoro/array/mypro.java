package com.tectoro.array;

public class mypro
{
	public static void main(String[] args) {
		int arr[]= {1,2,3,4,5,6};
		int num=5;
		int count=0;
		for(int i=0;i<arr.length-1;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{

			int num1=arr[i]+arr[j];
			if(num1%num==0)
			{
				count++;
				//System.out.println("pair is"+arr[i]+"   "+arr[j]);
			}
			}
		}
		System.out.println(count);
	}
}
