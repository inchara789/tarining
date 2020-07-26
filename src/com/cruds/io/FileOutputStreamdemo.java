package com.cruds.io;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamdemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String data="hello world hiii welcome!";
		byte[] payload=data.getBytes();
		FileOutputStream fos=null;
		try {
			fos=new FileOutputStream("output.txt");
			fos.write(payload);
			System.out.println("file written");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally
		{
			try {
				if(fos!=null)
				 fos.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		

	}

}
