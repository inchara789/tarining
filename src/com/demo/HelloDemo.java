package com.demo;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class HelloDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Properties prop=new Properties();
		try {
			prop.load(new FileInputStream("college.properties"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("welcome to "+ prop.getProperty("COLLEGE_NAME"));
		System.out.println("from principal "+ prop.getProperty("PRINCIPAL_NAME"));

	}

}
