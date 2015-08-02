package com.myesai.travelcandy.struts.action.util;

public class MenuItem {

	/**
	 * The name of the menu
	 */
	private final String name;
	
	/**
	 * private String url = null;
	 */
	private final String url;
	
	/**
	 * access rule
	 */
	private final String accessRule;
	
	public MenuItem(String name, String url, String accessRule){
		this.name = name;
		this.url = url;
		this.accessRule = accessRule;
	}
	
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	
	/**
	 * @return the url
	 */
	public String getUrl() {
		return url;
	}

	/**
	 * @return the accessRule
	 */
	public String getAccessRule() {
		return accessRule;
	}
	
}
