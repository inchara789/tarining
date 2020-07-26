package com.cruds.collections;

public class Product implements Comparable<Product>{
	private int pid;
	private String name;
	private double price;
	@Override
	public String toString() {
		return "Product [pid=" + pid + ", name=" + name + ", price=" + price + "]";
	}
	public Product(int pid, String name, double price) {
		super();
		this.pid = pid;
		this.name = name;
		this.price = price;
	}
	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		System.out.println("inside hashcode");
		return pid;
	}
	
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		Product other=(Product)obj;
		System.out.println("inside equals" + this.pid +"vs===" + other.pid);
		return this.pid==other.getPid();
	}
	@Override
	public int compareTo(Product o) {
		// TODO Auto-generated method stub
		return this.pid-o.pid;
	}

}
