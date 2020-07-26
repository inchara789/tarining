package com.demo;

import java.util.Scanner;

public class Arrayademo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] num= new int[3];
		/*num[0]=12;
		num[1]=123;
		num[2]=167;*/
		int j=0;
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter the array elements");
		for(int i=0;i<num.length;i++){
			num[i]=sc.nextInt();
		}
		System.out.println("enter the key element");
		int key=sc.nextInt();
		for(int i=0;i<num.length;i++){
			System.out.println(num[i]);
			if(num[i]==key){
				j=i;
				break;
				 //System.out.println("key element found");
			}
		
		}
		//System.out.println("array elements are");
		if(j>=1 && j<=num.length+1){
			System.out.println("key element  "+ key+" is present at  "+ "  position  "+(j+1)  );
		}
		else{
			System.out.println("key element not found");
		}
		/*System.out.println(num[0]);
		System.out.println(num[1]);
		System.out.println(num[2]);*/
	}

}
