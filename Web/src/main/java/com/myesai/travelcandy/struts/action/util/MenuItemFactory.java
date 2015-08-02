package com.myesai.travelcandy.struts.action.util;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.List;

public class MenuItemFactory{

	/**
	 * The List of menu items
	 */
	private Map<String,String> menuItemMap = new HashMap<String,String>();

	
	/**
	 * For global menu
	 */
	public MenuItemFactory(){
		/*
		 * TODO read from DataBase put if the rules are the same
		 */
		
		//normal way for a few menus
		List<MenuItem> items = new ArrayList<MenuItem>();
		items.add(new MenuItem("culture","culture", "rule1"));
		items.add(new MenuItem("contact","contact", "rule1"));
		items.add(new MenuItem("candy","candy", "rule2"));
		putItems(items);
	}
	
	/**
	 * for specific menu
	 */
	public MenuItemFactory(String menuName){
		
	}
	
	/**
	 * @return the menuItemMap
	 */
	public Map<String,String> getMenuItemMap() {
		return menuItemMap;
	}
	
	/**
	 * @param menuItemMap the menuItemMap to set
	 */
	public void setMenuItemMap(Map menuItemMap) {
		this.menuItemMap = menuItemMap;
	}

	public MenuItem getItemObj(String name){
		return new MenuItem(name, this.menuItemMap.get(name), null);
	}
	
	private void putItems(List<MenuItem> items){
		for(MenuItem item: items){
			this.menuItemMap.put(item.getName(), item.getUrl());
		}
	}
	
	
}
