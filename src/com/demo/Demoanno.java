package com.demo;

import com.cruds.anno.myanno;

public class Demoanno {
	@myanno(name="inchara",version=12)
	//@myanno(name = "sada", version = 1)
	public void test()
	{
		System.out.println("testing anno");
	}

}
