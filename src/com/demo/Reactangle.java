package com.demo;

public class Reactangle extends Figure{
	private double d3;

	public Reactangle(double d1,double d2)
	{
		//dim1=d1;
		//dim2=d2;
		super(d1,d2);
	}
	public Reactangle(double d1,double d2,double d3)
	{
		//dim1=d1;
		//dim2=d2;
		super(d1,d2);
		this.d3=d3;
	}

	@Override
	public double calcArea() {
		return dim1*dim2;
		
	}
	

}
