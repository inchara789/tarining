package com.cruds.io;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReaderDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try(BufferedReader br=new BufferedReader(new FileReader("capital.properties")))
		{
			String line=null;
			while((line=br.readLine())!=null)
			{
				System.out.println(line);
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
