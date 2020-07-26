package com.demo;

public class Bird implements IFly {

	@Override
	public void fly() {
		// TODO Auto-generated method stub
		System.out.println("Bird flying..");
		
	}

	@Override
	public void rest() {
		// TODO Auto-generated method stub
		System.out.println("Bird resting.");
		
	}
	public void egg(){
		System.out.println("bird laying eggs..");
	}

}
