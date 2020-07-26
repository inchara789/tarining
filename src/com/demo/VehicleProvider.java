package com.demo;

public class VehicleProvider {
	public static IVehicle getVehicle(String type)
	{
		if(type.equalsIgnoreCase(IVehicle.luxury_type))
		{
			return new car();
		}
		else if(type.equalsIgnoreCase(IVehicle.passenger_type))
		{
			return new Bus();
		}
		else if(type.equalsIgnoreCase(IVehicle.faithfull_type))
		{
			return new Dog();
		}
		else 
		{
			return null;
		}
		
	}

}
