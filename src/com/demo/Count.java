package com.demo;

public class Count {
	public static int no_obj;
	public  Count()
	{
		no_obj++;
	}
	
	 protected void finalize()
	 {
		 System.out.println("inside fina count="+ no_obj);
		 no_obj--;
		 System.out.println("exit finalise count="+no_obj);
	 }

}
