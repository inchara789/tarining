package com.cruds.exception;

public class SMSException extends RuntimeException{ //if it is exception insted of runtime esception then we are forced to handle it in teststudent
	private String msg;
	public SMSException(String msg)
	{
		this.msg=msg;
	}
	public String getMsg()
	{
		return this.msg;
	}

}
