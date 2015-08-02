package com.myesai.travelcandy.spring.tests;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;



import java.io.Reader;
import java.util.ArrayList;
import java.util.List;

import javax.json.Json;
import javax.json.JsonObject;
import javax.json.stream.JsonParser;
import javax.json.stream.JsonParserFactory;

import org.json.JSONArray;
import org.json.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.myesai.travelcandy.spring.util.MenuItemsBean;


public class App {
	public static void main(String[] args) throws IOException, ParseException {
		App a = new App();
		ClassLoader classLoader = a.getClass().getClassLoader();
		FileReader file = new FileReader(classLoader.getResource("menu.json").getFile());
		System.out.print(classLoader.getResource("menu.json").getFile());
		MenuItemsBean.getObject(classLoader.getResource("menu.json").getFile()).getGlobalMenuItems();
		
	}
}
