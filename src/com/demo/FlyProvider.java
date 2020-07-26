package com.demo;

public class FlyProvider  {
	public static IFly gettype(String type)
	{
		if(type.equalsIgnoreCase(IFly.feather_type))
		{
			return new Bird();
		}
		else if(type.equalsIgnoreCase(IFly.human_type))
		{
			return new Batman();
		}
		else if(type.equalsIgnoreCase(IFly.wing_type))
		{
			return new Plane();
		}
		else 
			{
			return null;
			}
	}
	

}
