package com.acme.base;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;

public class UserData {

	public static void main(String[] args) {

	//HashMap<String, String> userMap = new HashMap<String, String>();
	
		Map<String, String> userMap = new HashMap<String, String>();	
		
		userMap.put("id","1");
		userMap.put("name", "John");
		userMap.put("city","Istanbul");
		
		
		//System.out.println(userMap.get("name"));
		
		System.out.println(userMap.size());
		
		
		for(Map.Entry m : userMap.entrySet()) {
			System.out.println(m.getKey() + " " + m.getValue());
			
		}
		
		//Hashtable
		
		Hashtable<String, Integer> productTable = new Hashtable<String, Integer>();
		productTable.put("Apple", 2000);
		productTable.put("Windows", 1000);
		productTable.put("Linux", 2323);
		
		for(Map.Entry m : productTable.entrySet()) {
			System.out.println(m.getKey() + " " + m.getValue());
		}
		
		//Hashmap is not synchorinzed -- none thread safe
		
	}

}
