package com.demo;

import java.io.FileNotFoundException;
import java.sql.SQLException;

public class ThrowsDemo {
	static void throwone() throws Exception
	{
		System.out.println("inside throwone");
		//throw new FileNotFoundException();
		throw new ;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		throwone();

	}

}
