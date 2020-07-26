package com.cruds.io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.demo.BookDemo;
import com.demo.Student;

public class StudentDbTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StudentDb[] B=new StudentDb[25];
		List<StudentDb> list=new ArrayList<>();

		int pos=0;
		String name;
		int rollno; 
		String choice= "";
		Scanner scan=new Scanner(System.in);
		try(ObjectInputStream ois = new ObjectInputStream(new FileInputStream("studentdb.ser"));)
		{
			 list=(List<StudentDb>) ois.readObject();
			 for(StudentDb s:list)
				{
					System.out.println(s);
				}

			
		} catch (FileNotFoundException e1) {
			//e1.printStackTrace();
			System.out.println("First Run..");
		} catch (IOException e1) {
			e1.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		do {
			System.out.println("choose \n 1 for add Student \n 2 for search Student \n 3 for list all names \n 4 for delete a student\n 5 for exit");
			choice=scan.nextLine();
			System.out.println("selected choice is "+ choice);
			switch(choice)
			{
			case "1":
			{
				while(pos<B.length)
			{
				System.out.println("adding a student");
			    System.out.println("enter student name: ");
				name=scan.nextLine();
				
				System.out.println("enter roll number: ");
				rollno=scan.nextInt();
				scan.nextLine();
				
				StudentDb bd = new StudentDb(rollno, name);
				B[pos] = bd;
				list.add(bd);
				
				pos++;
				break;
			}
				break;
				
			}
			
			case "2":
			{
				System.out.println("enter the student roll no to be searched");
				int searchno=scan.nextInt();
				boolean flag=false;
				
				for(int i=0; i < list.size(); i++)
				{
					if(searchno == list.get(i).getRollno());
					  flag=true;
				}
				if(flag)
					System.out.println("found");
				else
					System.out.println("not found");
				
				break;
			}
			
			case "3":
			{
				System.out.println("listing all the elements:");
				for(StudentDb s:list)
				{
					System.out.println(s);
				}
				break;

			}
			case "4":
			{
				System.out.println("enter the student rollnum to be deleted");
				int delroll=scan.nextInt();
				for(int i=0; i < list.size(); i++)
				{
					if(delroll == list.get(i).getRollno());
					   list.remove(i);
				}
				System.out.println("student deleted");
				break;
			}
			
			case "5":
			{
				System.out.println("exiting..");
				try(ObjectOutputStream is=new ObjectOutputStream(new FileOutputStream("studentdb.ser"))){
					
					 ((ObjectOutput) is).writeObject(list);

				} catch (FileNotFoundException e) {
					e.printStackTrace();
				} catch (IOException e) {
					e.printStackTrace();
				}
				
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
