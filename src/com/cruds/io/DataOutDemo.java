package com.cruds.io;

import java.io.DataOutput;
import java.io.DataOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class DataOutDemo {

	public static void main(String[] args) {

		try(DataOutputStream dos=new DataOutputStream(new FileOutputStream("test.DAT")) )
				{
					dos.writeDouble(67.98);
					dos.writeInt(23);
					dos.writeUTF("inch");
				} catch (FileNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
	}

}
