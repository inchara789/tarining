package com.cruds.io;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

import com.demo.Student;

public class SerialDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Student> list=new ArrayList<>();
		
		Student s1=new Student(101, "inch");
		Student s2=new Student(101, "inch");
		list.add(s1);
		list.add(s2);
		try(ObjectOutputStream op=new ObjectOutputStream(new FileOutputStream("student.ser")))
		{
			//op.writeObject(s1);
			op.writeObject(list);
			System.out.println(" object written successfull");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
