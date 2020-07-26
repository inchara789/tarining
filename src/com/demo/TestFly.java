package com.demo;

public  class TestFly {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*IFly f=new Bird();
		Batman b=new Batman();
		b.fly();
		b.rest();
		f.fly();
		f.rest();*/
		//IFly i = FlyProvider.gettype(IFly.feather_type);
		IFly j=FlyProvider.gettype(IFly.human_type);
		j.fly();
		j.rest();
		//IFly k=FlyProvider.gettype(IFly.wing_type);
		
		
		

	}

}
