package com.cruds.demo;

public class GgpaDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] input={"100","5","100","5","100","5"};
		double[] nums=new double[6];
		for(int i=0;i<input.length;i=i+2)
		{
		double grade=getGradeMarks(Double.parseDouble(input[i]));
		int credit=Integer.parseInt(input[i+1]);
		nums[i]=grade;
		nums[i+1]=credit;
		}
		System.out.println(getcgpa(nums));
	}
	
	private static double getcgpa(double[] nums)
	{
		double num=0;
		for(int i=0;i<nums.length;i=i+2)
				
		{
			num+=nums[i]*nums[i+1];		
				
		}
		return num/((nums.length/2)*5);
	}
	
	private static double getGradeMarks(double marks)
	{
		
		if(marks>=75 && marks<=100)
		{
			double grade=9.0;
			double mark=marks;
			int count=0;
			while(marks>=75)
			{
			marks=marks-2.36;
			count+=0.1;
			
			}
			grade+=count;
			return grade;
		}
		else if(marks<75 && marks>=60)
		{
			double grade=8.0;
			double mark=marks;
			int count=0;
			while(marks>=60)
			{
			marks=marks-1.67;
			count+=0.1;
			
			}
			grade+=count;
			return grade;
			
		}
		else if(marks>=50 && marks<=59)
		{
			double grade=7.0;
			double mark=marks;
			int count=0;
			while(marks>=60)
			{
			marks=marks-1;
			count+=0.1;
			
			}
			grade+=count;
			return grade;
		}
		else if(marks>=40&& marks<=49)
		{
			double grade=6.0;
			double mark=marks;
			int count=0;
			while(marks>=60)
			{
			marks=marks-1;
			count+=0.1;
			
			}
			grade+=count;
			return grade;
		}
		else
		{
		return 0.0;
		}
	}
	
	

}
