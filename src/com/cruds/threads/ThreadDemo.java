package com.cruds.threads;

public class ThreadDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*System.out.println(Thread.currentThread());
		//System.out.println("hello!"); //debug alli suspend
		
		
		
		
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("prgm ends");*/
		
		/*System.out.println(Thread.currentThread());
		Thread t=new MyThread("child1 ");
		t.start(); //t.run() is given main only does the work sinle thread.
		Thread t2=new MyThread("child2 ");
		t2.start();
		
		System.out.println("main thread ends");*/
		
		
		/*System.out.println(Thread.currentThread());
		Thread t=new MyThread("child1 ");
		t.start(); //t.run() is given main only does the work sinle thread.
		Thread t2=new MyThread("child2 ");
		t2.start();
		try {
			t.join();
			t2.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("main thread ends");*/
		
		
		
		System.out.println(Thread.currentThread());
		Thread t=new MyThread("child1 ");
		t.start(); //t.run() is given main only does the work sinle thread.
		MyThreadR t2=new MyThreadR("child R 2 ");
		t2.t.start();
		try {
			t.join();
			t2.t.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("main thread ends");
		
		
	}

}
