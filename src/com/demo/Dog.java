package com.demo;

public class Dog extends Animal implements IVehicle {
	public void talk()
	{
		System.out.println("bow bow");
	}
	public void wagTail()
	{
		System.out.println("dog wagging");
	}
	//@Override
	//public void eat() {
		// TODO Auto-generated method stub
		//System.out.println("pedegree..");
	@Override
	public void start() {
		// TODO Auto-generated method stub
		System.out.println("dog starts..");
		
	}
	@Override
	public void stop() {
		// TODO Auto-generated method stub
		System.out.println("dog stops");
		
	}
		
	//}
}
