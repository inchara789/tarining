package com.demo;

public abstract class A1 {
	//public abstract void  m1();
		//System.out.println("In method m1 of A1");
		//return 100;
	//A1(){ System.out.println("A1's no arg constructor"); }
	  // A1(int a){ System.out.println("A1's constructor "+ a); }
	
	
	  double width;
	  double height;
	  double depth;

	  A1 (double w, double h, double d) {
	    width = w;
	    height = h;
	    depth = d;
	  }

	  public String toString() {
	    return "Dimensions are " + width + " by " + 
	            depth + " by " + height + ".";
	  }


}
