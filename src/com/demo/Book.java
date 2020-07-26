package com.demo;

public class Book {
private String title;
private double price;
private int Num;
public Book(int Num, String title ){
	this.title=title;
	this.Num=Num;
}
public Book(int Num, String title , double price){
	//this.Num=Num;
	//this.price=price;
	this(Num,title);
	this.title=title;
}
public String getTitle() {
	return title;
}
public void setTitle(String title) {
	this.title = title;
}
public double getPrice() {
	return price;
}
public void setPrice(double price) {
	this.price = price;
}
public int getNum() {
	return Num;
}
public void setNum(int num) {
	Num = num;
}
//public  void display(){
	//System.out.println("title="+title+"\n book number=" +  Num+ "\nprice:"+ price);
//}
@Override
public String toString() {
	return "Book [title=" + title + ", price=" + price + ", Num=" + Num + "]";
}



}
