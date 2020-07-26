package com.demo;

import java.util.Scanner;

public class HelloWorld {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter your name");
		String name = sc.nextLine();
		System.out.println("enter your age");
		int age = sc.nextInt();
		//System.out.println("hi " + name + " i am " + age+ " years old");
		if(age<16){
			System.out.println("hi "+ name +" too young for java");
		}
		else if(age>50){
			System.out.println("hi "+ name + " too old for java");
		}
		else {
			System.out.println("hi "+ name + " welcome to java");
		}

	}

}
