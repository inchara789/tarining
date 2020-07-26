package com.cruds.io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.List;

import com.demo.Student;

public class DeserialDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try(ObjectInputStream is=new ObjectInputStream(new FileInputStream("student.ser"))){
			 //Student s=(Student) is.readObject();
			 //System.out.println(s);
			 //s.setPassword("very secret");
			List<Student> list=(List<Student>)is.readObject();
			for(Student s:list)
			{
				System.out.println(s);
			}
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
