package com.demo;

public class Calculator {
	public int divide(int x, int y)
	{
		int result=0;
		int[] nums=new int[3];
		Student s=null;
		try
		{
			s.setRollno(100);
			nums[3]=99;
			System.out.println("before calc");
			result=x/y;
			System.out.println("after calc");
		}
		/*catch(NullPointerException e)
		{
			System.out.println("null pointer");
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("array bounds");
		}
		catch(ArithmeticException e)
		{
			System.out.println("invlaid divisor");
			
		}*/
		
		catch(RuntimeException e)//even if there are no catch blocks finally is executed
		{
			System.out.println("runtime exception"+ e.getMessage());
		}
		finally
		{
			System.out.println("inside finally..");
		}
		return result;
	}

}
