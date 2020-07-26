package com.cruds.threads;

public class Clicker implements Runnable{
	long count;
	Thread t;
	private volatile boolean running=true;
	
	
 public Clicker(int priority) {
	// TODO Auto-generated constructor stub
	 t=new Thread(this);
	 t.setPriority(priority);
	 
	
}
 
 public void start()
 {
	 t.start();
 }
 public void stop()
 {
	 running=false;
 }
	@Override
	public void run() {
		// TODO Auto-generated method stub
		while(running)
		{
			count++;
		}
		
	}
	

}
