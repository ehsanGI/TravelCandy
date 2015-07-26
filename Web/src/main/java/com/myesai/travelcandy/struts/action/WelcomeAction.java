package com.myesai.travelcandy.struts.action;

import com.opensymphony.xwork2.ActionSupport;

public class WelcomeAction extends ActionSupport{

	private static String message = "this is a message";

	@Override
	public String execute() throws Exception {
		return SUCCESS;
	}

	/**
	 * @return the message
	 */
	public static String getMessage() {
		return message;
	}

	/**
	 * @param message the message to set
	 */
	public static void setMessage(String message) {
		WelcomeAction.message = message;
	}
	
	

	
}
