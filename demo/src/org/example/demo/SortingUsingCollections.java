package org.example.demo;

import java.util.Arrays;

public class SortingUsingCollections {

	public static void main(String[] args) {
		int []a= {4,2,4,4,3,1,3};
		System.out.println("Largest number is  => "+getLargest(a, 7));
		System.out.println("Smallest number is  => "+getSmallest(a, 7));
		
	}
	public static int getLargest(int []a ,int total)
	{
		Arrays.sort(a);
		return a[total-1];
	}
	public static int getSmallest(int []a ,int total)
	{
		Arrays.sort(a);
		return a[0];
	}

}
