package com.demo;

import java.io.Serializable;

import com.cruds.exception.SMSException;

public class Student implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 2L;
	private int rollno;
    private String name;
    private static int count;
    private transient String password;
    
    public Student(int rollno, String name) throws SMSException
    {
    	if(name.equalsIgnoreCase("") || name.equals(null))
    	{
    		throw new SMSException("name cannot be null");
    	}
    	if(rollno<0)
    	{
    		throw new SMSException("rollnum cant be negative"+rollno);
    	}
    	this.name=name;
    	this.rollno=rollno;
    	count++;
    }
    
	@Override
	public String toString() {
		return "Student [rollno=" + rollno + ", name=" + name + ", password=" + password + "]";
	}

	public static int getcount(){
    	return count;
    }
    
    
    
    public int getRollno() {
		return rollno;
	}
	public void setRollno(int rollno)throws SMSException {
		if(rollno<0)
		{
			throw new SMSException("rollnum cant be negative"+rollno);
		}
		this.rollno = rollno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
}
