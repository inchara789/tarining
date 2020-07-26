package com.cruds.threads;

public class MyThread extends Thread{
	
	public MyThread(String name)
	{
		setName(name);
	}
	
@Override
public void run() {
	
	System.out.println("inside run method"+Thread.currentThread());
	for(int i=5;i>0;i--)
	{
		System.out.println("child thread"+ i);
		try {
			Thread.sleep(1500);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	System.out.println("run method exit"+ Thread.currentThread());
}

}
