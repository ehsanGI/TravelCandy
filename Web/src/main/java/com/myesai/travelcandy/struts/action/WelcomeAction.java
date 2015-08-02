package com.myesai.travelcandy.struts.action;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.myesai.travelcandy.spring.tests.HelloWorld;

public class WelcomeAction extends BaseSimpleAction{

	private static String message = "ssdf";

	public WelcomeAction(){
		super();
	}
	
	@Override
	public String execute() throws Exception {
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"Spring-Module.xml");
 
		HelloWorld obj = (HelloWorld) context.getBean("helloBean");
		
		
		
		message = obj.getName();
		
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
