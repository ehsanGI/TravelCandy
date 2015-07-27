package com.myesai.travelcandy.struts.action;

public class WelcomeAction extends BaseSimpleAction{

	private static String message = "this is a message";

	public WelcomeAction(){
		super();
	}
	
	@Override
	public String execute() throws Exception {
		this.message = BaseSimpleAction.getGlobalMenuItems().get(0).getName();
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
