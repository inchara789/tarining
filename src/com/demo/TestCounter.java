package com.demo;

public class TestCounter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Count c1=new Count();
		Count c2=new Count();
		
		c1=null;
		c2=null;
		System.gc();
		

	}

}
