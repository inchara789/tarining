package com.demo;

import java.util.Scanner;

public class StringArrDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] names=new String[3];
		
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<names.length;i++){
			System.out.println("Enter a name");
			names[i]=sc.nextLine();
		}
		/*names[0]= "inchara";
		names[1]="nisu";
		names[2]="charvi";*/
		while(true){
			
		System.out.println("enter a name to search or q");
		String searchName=sc.nextLine();
		boolean found=false;
		if(searchName.equalsIgnoreCase("q")){
			System.out.println("quitting loop");
			break;
		}
		for(String s: names){
			if(s.equals(searchName)){
				found=true;
				break;
			}
			//System.out.println(s);
		}
		if(found){
			System.out.println("search name found");
		}
		else{
			System.out.println("not found");
		}
		}
		sc.close();

	}

}
