package com.cruds.collections;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public abstract class SetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stubSet
		Set<String> names=new TreeSet<>();
		names.add("inch");
		names.add("in");
		names.add("in");
		names.add("anu");
		names.add("inch");

		for(String s:names)
		{
			System.out.println(s);
		}

	}

}
