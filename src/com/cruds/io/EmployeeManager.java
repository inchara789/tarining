package com.cruds.io;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;



public class EmployeeManager {
	
	public static void addContact(Employee employee, File dest) throws IOException
	{
	FileOutputStream fos = new FileOutputStream(dest, true);
	BufferedOutputStream bos = new BufferedOutputStream(fos);
	DataOutputStream out = new DataOutputStream(bos);
	out.writeInt(employee.getId());
	out.writeUTF(employee.getName());

	out.close();
	}
	public static ArrayList<Employee> getEmployeeList(File source) throws IOException
	{
	ArrayList < Employee > emplist = new ArrayList < Employee > ();
	FileInputStream fis = new FileInputStream(source);
	BufferedInputStream bis = new BufferedInputStream(fis);
	DataInputStream in = new DataInputStream(bis);
	while(in.available() > 0) {
	int id = in.readInt();
	String name = in.readUTF();
	emplist.add(new Employee(id, name));
	}

	return emplist;
	}



	public static void main(String[] args) {
		Employee e1 = new Employee(101, "sada");
		Employee e2 = new Employee(102, "Chida");
		File employeeFile = new File("EmpList.dat");

		try {
		addContact(e1, employeeFile);
		addContact(e2, employeeFile);

		System.out.println(getEmployeeList(employeeFile));

		} catch (IOException e) {
				e.printStackTrace();


	}
	}

}
