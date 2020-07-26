package com.cruds.threads;

public class ClickerDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread.currentThread().setPriority(Thread.MAX_PRIORITY-1);
		Clicker hi=new Clicker(Thread.NORM_PRIORITY+2);
		Clicker low=new Clicker(Thread.NORM_PRIORITY-2);
		low.start();
		hi.start();
		try {
			Thread.sleep(5000);
			low.stop();
			hi.stop();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("low counter"+ low.count);
		System.out.println("high counter "+hi.count);

	}

}
