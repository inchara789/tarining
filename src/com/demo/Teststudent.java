package com.demo;

import com.cruds.exception.SMSException;

public class Teststudent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s1=new Student(101,"inch");
		System.out.println(Student.getcount());
		s1.setRollno(-101);
		
		/*try {
			Student s2=new Student(102,"");
		} catch (SMSException e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
			System.out.println(e.getMsg());
		}*/
		//System.out.println(Student.getcount());

		//s.setName("inch");
		//s.rollno=100;
		//s.setRollno(100);
		//System.out.println(s.getName());
		//System.out.println("roolno="+s.getRollno());
		

	}

}
