package com.cruds.threads;

public class User implements Runnable {
	Thread t;
	Printer p;
	String msg;
	public User(String msg,Printer p)
	{
		t=new Thread(this);
		this.msg=msg;
		this.p=p;
		t.start();
	}
	/*@Override
	public void run() {
		// TODO Auto-generated method stub
		p.print(msg);
		
	}


}*/
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		synchronized (p) {
			p.print(msg);
		}
		
		
	}


}
