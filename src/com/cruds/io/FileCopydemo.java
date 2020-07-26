package com.cruds.io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileCopydemo {

	public static void main(String[] args) {
		//try with resources
		try(FileInputStream fis=new FileInputStream("D:\\HTML\\hi.html");FileOutputStream fos=new FileOutputStream("OutPut.txt"))
		{
			int size=fis.available();
			byte[] buf= new byte[size];
			int length;
			while((length=fis.read(buf))>0)
			{
				fos.write(buf, 0,length);
			}
			System.out.println("file written");
			
			
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
