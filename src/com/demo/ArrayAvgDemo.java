package com.demo;

import java.util.Scanner;

public class ArrayAvgDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum=0;
		float avg=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("pls enter size of the array:");
		int size=sc.nextInt();
		int[] num=new int[size];
		for(int i=0;i<size;i++)
		{
			System.out.println("enter an element");

			num[i]=sc.nextInt();
			sum+=num[i];
		}
		avg=(float)sum/size;
		System.out.println("array elements are:");
		for(int i=0;i<size;i++)
		{
			System.out.println(num[i]);
		}
		System.out.println("sum of array elements="+sum);
		System.out.println("average of array elements="+avg);
		sc.close();
	}

}
