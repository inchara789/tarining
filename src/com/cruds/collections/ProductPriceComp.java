package com.cruds.collections;

import java.util.Comparator;

public class ProductPriceComp implements Comparator<Product>{

	@Override
	public int compare(Product o1, Product o2) {
		// TODO Auto-generated method stub
	return  (int) (o1.getPrice()-o2.getPrice());
		
	}
	

}
