package com.demo;

import java.util.Scanner;

public class BookDemoTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BookDemo[] B=new BookDemo[25];
		int pos=0;
		String title;
		int bookno; 
		String choice= "";
		Scanner scan=new Scanner(System.in);
		do {
			System.out.println("choose \n 1 for add book \n 2 for search book \n 3 for list all names \n 4 for delete a book\n 5 for exit");
			choice=scan.nextLine();
			System.out.println("selected choice is "+ choice);
			switch(choice)
			{
			case "1":
			{
				while(pos<B.length)
			{
				System.out.println("adding a book");
			    System.out.println("enter book title: ");
				title=scan.nextLine();
				
				
				//B[pos]= new BookDemo();
				//B[pos].setTitle(temp);
				System.out.println("enter book number: ");
				bookno=scan.nextInt();
				scan.nextLine();
				
				BookDemo bd = new BookDemo(bookno, title);
				//B[pos]= new BookDemo(temp1,temp);
				//B[pos].setNum(temp1);
				B[pos] = bd;
				pos++;
				break;
			}
				break;
				
			}
			
			case "2":
			{
				System.out.println("enter the book name to be searched");
				String searchname=scan.nextLine();
				boolean flag=false;
				for(int i=0;i<=pos;i++)
				{
					BookDemo bd = B[i]; //not required instead of bd use B[i] in if statement.
					if(searchname.equalsIgnoreCase(bd.getTitle()))
					{
						flag=true;
						break;
					}
				}
				if(flag)
				{
					System.out.println("book found");
				}
				else
				{
					System.out.println("book not found");
				}
				break;
			}
			
			case "3":
			{
				System.out.println("listing all the elements:");
				for(int i=0;i<pos;i++)
				{
					//B[i]=new BookDemo();
					if(B[i] != null)
						B[i].disp();
				}
				break;

			}
			case "4":
			{
				System.out.println("enter the book name to be deleted");
				String delname=scan.nextLine();
				for(int i=0;i<=pos;i++)
				{
					if(delname.equalsIgnoreCase(B[i].getTitle()))
					{
						
						//B[i]=new BookDemo();
						B[i]=null;
						//B[i].setNum(0);
						System.out.println("book deleted");
						break;
					}
				}
				break;
			}
			
			case "5":
			{
				System.out.println("exiting..");
				break;
				
			}
			default:{ 
				System.out.println("invalid choice..");
			break;
			}
			}

			
		} while (!choice.equals("5"));
		scan.close();

	}

}
