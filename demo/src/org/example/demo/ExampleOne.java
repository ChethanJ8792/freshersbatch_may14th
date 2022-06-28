package org.example.demo;

public class ExampleOne {
	public static void main(String[] args) {
		int a[]= {100,2,3,3,42};
		int b[]= {44,6,7,7,5,55};
		System.out.println("Largest "+getLargest(a,5));
		System.out.println("Largest "+getLargest(b,6));
	}
	public static int getLargest(int [] a,int total)
	{
		int temp;
		for(int i=0;i<total;i++)
		{
			for(int j=i+1;j<total;j++)
			{
			if(a[i]>a[j])
			{
				temp=a[i];
				a[i]=a[j];
				a[j]=temp;
			}
			}
		}
		return a[total-1];
	}

}
