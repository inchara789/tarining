package com.demo;

public class BookDemo {
private int num;
private String title;
//int i=0;
//Scanner sc=new Scanner(System.in);
public BookDemo(int num, String title)
{
	this.num=num;
	this.title=title;
}


public int getNum() {
	return num;
}


public void setNum(int num) {
	this.num = num;
}


public String getTitle() {
	return title;
}


public void setTitle(String title) {
	this.title = title;
}


public void disp()
{
	//if(title!=null)
	  System.out.println("title= " + title + " \t number= " + num);
	  return;
}

}
