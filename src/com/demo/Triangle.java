package com.demo;

public class Triangle extends Figure {
	public Triangle(double b, double h)
	{
		//dim1=b;
		//dim2=h;
		super(b,h);
	}

	@Override
	public double calcArea() {
		// TODO Auto-generated method stub
		return 0.5*dim1*dim2;
		
	}
	

}
