package com.cruds.collections;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class ProdDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Set<Product> prods=new HashSet<>();
		prods.add(new Product(101, "samsung", 55555.5555));    ///hashcode and equals are not called in treeset as it is based on order.
		prods.add(new Product(102, "xiomi", 12350560.33));
		prods.add(new Product(103, "op", 96.232));
		prods.add(new Product(103, "op", 96.232));*/
		
		//Set<Product> prods=new TreeSet<>();
		//Set<Product> prods=new TreeSet<>(new ProductNameComp());
		Set<Product> prods=new TreeSet<>(new ProductPriceComp());
		prods.add(new Product(101, "samsung", 55555.5555));
		prods.add(new Product(102, "xiomi", 12350560.33));
		prods.add(new Product(103, "op", 96.232));
		prods.add(new Product(103, "op", 96.232));
		
		for(Product p:prods)
			{
	System.out.println(p);
			}

		

	}

}
