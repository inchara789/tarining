package com.demo;


public class Sample  {
	
		public static void main(String[] args) {
			//System.out.println("executed");
			//A2 x = new A2();
			//A3 ca = new A3(10);
			//x.m1();
			
			/*A1 b=new A1(10,12,13);
			
			
		    String s = "Box b: " + b; // concatenate Box object

		    System.out.println(b); // convert Box to string
		    System.out.println(s);*/
			try {
				int i= Integer.parseInt(args[0]);
				System.out.println(i);
			}
			
			System.out.println("Testing");
			
			catch (NumberFormatException e)
			{
				System.out.println(e);
			}

 

		}

	
		
	}



