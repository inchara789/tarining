package com.demo;

import java.util.Scanner;

public class NameDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] names=new String[25];
		int pos=0;
		String choice="";
		//boolean found=false;
		Scanner sc=new Scanner(System.in);
		do {
			System.out.println("choose \n 1 for add name \n 2 for search name \n 3 for list all names \n 4 for delete a name\n 5 for exit");
			choice=sc.nextLine();
			System.out.println("selected choice is "+ choice);
			switch(choice)
			{
			case "1":
			{
				System.out.println("enter a name");
				names[pos]=sc.nextLine();
				pos++;
				break;
			}
			case "2":
			{
				System.out.println("enter the name to be searched ");
				String searchName=sc.nextLine();
			    boolean found = false;
				for(int i=0; i<pos;i++)
				{
					if(searchName.equals(names[i]))
					{
						found=true;
						break;
					}
				}
				if(found)
				{
					System.out.println("name found");
				}
				else
				{
					System.out.println("search name not found");
				}
				break;
			}
			case "3":
			{
				for(int i=0;i<pos;i++ )
				{
					if(names[i] != null)
						System.out.println(names[i]);
				}
				break;
			}
			case "4":
			{
				System.out.println("enter the name to be deleted ");
				String delName=sc.nextLine();
				boolean flag=false;
				for(int i=0; i<pos;i++)
				{
					if(delName.equals(names[i]))
					{
						names[i] = null;
						flag=true;
						break;
					}
				}
				if(flag)
				{
					System.out.println("delname deleted");
				}
				else
				{
					System.out.println("delname not found");
				}
							
				
				break;
				
			}
			case "5":
			{
				System.out.println("exiting..");
				break;
			}
			default :
				System.out.println("invalid choice select again");
			     break;
			}
		} while (!choice.equals("5"));
		
		sc.close();
	}

}
