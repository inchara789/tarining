package com.cruds.threads;

public class SyncDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Printer p=new Printer();
		User u1=new User("hello",p);
		User u2=new User("world",p);

		User u3=new User("sync",p);
		
		try {
			u1.t.join();
			u2.t.join();
			u3.t.join();

			
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		

	}

}
