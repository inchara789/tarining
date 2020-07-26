package com.cruds.io;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class DataInputDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try(DataInputStream dis=new DataInputStream(new FileInputStream("test.DAT")))
		{
			System.out.println(dis.readDouble());
			System.out.println(dis.readInt());
			System.out.println(dis.readUTF());
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
