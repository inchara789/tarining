package com.cruds.io;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class BufferedDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			BufferedInputStream bis = new BufferedInputStream(new FileInputStream("D:\\HTML\\hi.html"));
			BufferedOutputStream bos=new BufferedOutputStream(new  FileOutputStream("sample.txt"));
			byte[] data=new byte[1024];
			boolean eof=false;
			while(!eof)
			{
				int len=bis.read(data);
				if(len== -1)
				{
					eof=true;
				}
				else
				{
					bos.write(data, 0, len);
					//bos.flush();
				}
			}
			bos.close();
			bis.close();
		}
		
		
		
		catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		

	}

}
