package com.demo;

import java.util.Scanner;

public class NumDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter three numbers");
		int num1=sc.nextInt();
		int num2=sc.nextInt();
		int num3=sc.nextInt();
		if( num1>num2 && num1>num3){
			
			System.out.println("num1 "+num1+" is greater than other two");
			}
			
		else if( num2>num1 && num2>num3){
			
			System.out.println("num2 "+num2+" is greater than other two");
			}
		else {
			
			System.out.println("num3 "+num3+" is greater than other two");
			}
		

	}

}
