package com.demo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.Date;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Locale;
import java.util.StringTokenizer;



public class StringDemo {
	static String str = "title=Java: The Complete Reference;" + "author=Schildt;" + "publisher=Osborne/McGraw-Hill;"; 


	public static void main(String[] args) 
			throws IOException
{
		Date date = new Date(0);
		SimpleDateFormat sdf;
		sdf = new SimpleDateFormat("hh:mm:ss");
		System.out.println(sdf.format(date));
		sdf = new SimpleDateFormat("dd MMM yyyy hh:mm:ss zzz");
		System.out.println(sdf.format(date));
		sdf = new SimpleDateFormat("E MMM dd yyyy");
		System.out.println(sdf.format(date));
















	  

	}

}
