package com.demo;

public  class Animaltest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animal a= AnimalProvider.getAnimal("cunning");
		a.talk();
		if(a instanceof Dog)
		{
			((Dog)a).wagTail();
		}
		
		//Dog d=new Dog();
		//d.talk();
		//Cat c=new Cat();
		//c.talk();
		//Animal a=new Dog();
		//((Dog)a).wagTail(); //type casting

	}

}
