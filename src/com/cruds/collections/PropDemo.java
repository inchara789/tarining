package com.cruds.collections;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class PropDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Properties prop=new Properties();
		prop.put("kar", "bng");
		prop.put("tn", "chn");
		prop.put("mh", "mum");
		System.out.println(prop.get("kar"));
		System.out.println(prop.getProperty("ap", "not found"));
		try {
			prop.store(new FileOutputStream("capital.properties"),"state captals");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} //exception so try and catch
		

	}

}
