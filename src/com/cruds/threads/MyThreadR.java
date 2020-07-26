package com.cruds.threads;

public class MyThreadR implements Runnable{
	Thread t;
	public MyThreadR(String name)
	{
		t=new Thread(this, name);
		//t.start();
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
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
