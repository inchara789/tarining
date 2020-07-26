package com.demo;

public class Figuretest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Figure f=new Reactangle(10, 20);
		System.out.println("area="+ f.calcArea());
		Figure e=new Triangle(10,20);

		System.out.println("area of tria="+e.calcArea() );
	}

}
