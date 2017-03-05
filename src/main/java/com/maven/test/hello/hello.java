package com.maven.test.hello;

import com.opensymphony.xwork2.ActionSupport;

public class hello  extends ActionSupport{
  

	private String message;

	public String execute() {

		message = "good evening";
		return SUCCESS;

	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
}
