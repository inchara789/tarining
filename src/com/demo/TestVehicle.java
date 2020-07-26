package com.demo;

public class TestVehicle {

	public static void main(String[] args) {
		//car c=new car();// either car or ivehicle
		//IVehicle c=new car();
		//IVehicle s=VehicleProvider.getVehicle("faithfull");
		//IVehicle s=VehicleProvider.getVehicle(IVehicle.faithfull_type);
		IVehicle s=VehicleProvider.getVehicle(IVehicle.luxury_type);

		//IVehicle b=new Bus();
		//c.start();
		//c.stop();
		s.start();
		s.stop();
		//b.start();
		//b.stop();
		// TODO Auto-generated method stub
		if(s instanceof Dog)
		{
			((Dog)s).wagTail();
		}

	}

}
