package com.myesai.travelcandy.struts.action;

import java.util.ArrayList;
import java.util.List;

import com.myesai.travelcandy.struts.action.util.MenuItem;
import com.myesai.travelcandy.struts.action.util.MenuItemFactory;
import com.opensymphony.xwork2.ActionSupport;

abstract public class BaseSimpleAction extends ActionSupport{

	private static final List<MenuItem> globalMenuItems = new ArrayList<MenuItem>();
	private String a = "asdasdasd";

	protected BaseSimpleAction(){
		if(BaseSimpleAction.globalMenuItems.isEmpty()){
			/*
			 * here we add the elements to the global Menu Item
			 */
			MenuItemFactory itemF = new MenuItemFactory(); 
			for(String name : itemF.getMenuItemMap().keySet()){
				BaseSimpleAction.globalMenuItems.add(itemF.getItemObj(name));
			}
			
		}
	}
	
	/**
	 * @return the globalmenuitems
	 */
	public static List<MenuItem> getGlobalMenuItems() {
		return globalMenuItems;
	}

	/**
	 * @return the a
	 */
	public String getA() {
		return a;
	}

	/**
	 * @param a the a to set
	 */
	public void setA(String a) {
		this.a = a;
	}
	
	
	
}
