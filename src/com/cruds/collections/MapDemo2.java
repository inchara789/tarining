package com.cruds.collections;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MapDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<Integer, String> students=new HashMap<>();
		students.put(101, "inch");
		students.put(102, "in");
		students.put(101, "kiran");
		
		Set<Entry<Integer, String>> entryset=students.entrySet();
		for(Entry<Integer, String> e:entryset)
		{
			System.out.println(e.getKey() + ":" + e.getValue());
		}
		
		
		
		
		System.out.println(students.get(101));
		Set<Integer> keys=students.keySet();
		for(int i:keys)
		{
			System.out.println(i);
		}
		
		Collection<String> names=students.values();
		for(String s:names)
		{
			System.out.println(s);
		}
				
		
	}

}
