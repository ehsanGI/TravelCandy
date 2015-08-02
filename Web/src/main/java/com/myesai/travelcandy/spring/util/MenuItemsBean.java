package com.myesai.travelcandy.spring.util;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;










import org.json.JSONArray;
import org.json.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import com.myesai.travelcandy.struts.action.util.MenuItem;

public class MenuItemsBean {

	private static List<MenuItem> globalMenuItems = new ArrayList<MenuItem>();
	private static MenuItemsBean obj = null;
	
	/**
	 * this contructor initialize the menu list
	 * @throws ParseException 
	 * @throws IOException 
	 */
	private MenuItemsBean(String filePath){

		/*
		 * get the file from the location filePath
		 */
		JSONObject jsonObject = null;
		try {
			
			final String JSON_STRING = (new JSONParser())
										.parse(new FileReader(filePath))
										.toString();
			
			jsonObject = new JSONObject(JSON_STRING);
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		/*
		 * prepare the globalmenu items
		 */
		JSONArray jsonArray = jsonObject.getJSONArray("global"); 
		for (int i = 0; i < jsonArray.length(); i++) {
			JSONObject json = jsonArray.getJSONObject(i);
			MenuItem mit = new MenuItem(json.get("name").toString(), 
					json.get("url").toString(), 
					json.get("accessRule").toString()
					);
			globalMenuItems.add(mit);
		}
		
		
	}
	
	/**
	 * get the single object afted making it
	 * @return
	 */
	public static MenuItemsBean getObject(String url){
		if(obj==null){
			Object obj = new Object();
			synchronized(obj){
					obj = new MenuItemsBean(url);
			}
		}
		return obj;
		
	}

	/**
	 * @return the globalMenuItems
	 */
	public static List<MenuItem> getGlobalMenuItems() {
		return globalMenuItems;
	}

}


