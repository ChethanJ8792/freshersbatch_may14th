package org.example.demo;

public class LargestNumberInAarray {

	public static void main(String[] args) {
		int []a= {10,4,15,5,1,7,8,2};
		System.out.println("Largest number is => "+getLargest(a,7));
		System.out.println("Smallest number is => "+getSmallest(a,7));
	
	}
	public static int getLargest(int [] a,int total)
	{
		int temp;
		for(int i=0;i<total;i++)
		{
			for(int j=i+1;j<total;j++)
			{
			if(a[i]>a[i+1])
			{
				temp=a[i];
				a[i]=a[i+1];
				a[i+1]=temp;
				/*
				 * OR
				 * temp=a[i]
				 * a[i]=a[j];
				 * a[j]=temp;
				 * */
				
			}
			}
		}
		return a[total-1];
	}
	public static int getSmallest(int [] a,int total)
	{
		int temp;
		for(int i=0;i<total;i++)
		{
			for(int j=i+1;j<total;j++)
			{
			if(a[i]<a[i+1])
			{
				temp=a[i];
				a[i]=a[i+1];
				a[i+1]=temp;
				
			}
			}
		}
		return a[total-1];
	}
}

