package com.cruds.collections;

import java.util.Comparator;

public class ProductNameComp implements Comparator<Product> {

	@Override
	public int compare(Product o1, Product o2) {
		// TODO Auto-generated method stub
		return o1.getName().compareTo(o2.getName());
	}
	
	

}
