package com.cruds.generic;

public class TestBox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		IntBox ib=new IntBox();
		ib.setT(100);
		
		DblBox db=new DblBox();
		db.setT(200.9);
		
		System.out.println(ib.getT());
		System.out.println(db.getT());
		
		//instead of writing somany classes like intbox doublebox , a generic classs box is written 
		
		
		BoxGeneric<Integer> bx=new BoxGeneric<>();
		bx.setT(102);
		BoxGeneric<Double> b=new BoxGeneric<>();
		b.setT(102.8);
		System.out.println(bx.getT());
		System.out.println(b.getT());
		

	}

}
