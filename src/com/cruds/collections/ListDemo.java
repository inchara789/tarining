package com.cruds.collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> names=new ArrayList<>();
		names.add("inch");
		names.add("in");
		names.add("in");
		names.add("anu");
		names.add(1, "kiran");
		for(String s:names)
		{
			System.out.println(s);
		}
		
		for(int i=0;i<names.size();i++)
		{
			System.out.println(names.get(i));
		}
		Iterator<String> iter=names.iterator();
		while(iter.hasNext())
		{
			System.out.println(iter.next());
		}

	}

}
