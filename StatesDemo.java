package com.lumen.set;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class StatesDemo {

	public static void main(String[] args) {
		Map<String,List<String>> states=new HashMap<>();
		states.put("Karnataka",Arrays.asList("Bangalore","Mangalore","Kolar"));
		states.put("Andhra Pradesh", Arrays.asList("Kadapa","kurnool","Ananthapur"));
		states.put("Tamil Nadu", Arrays.asList("Chennai","Tiruchirapalli","Vellore"));
		states.put("Delhi",Arrays.asList("New Delhi","taj pul"));
		
		System.out.println(states.get("Karnataka"));
		
		Set<String> getcities=states.keySet();
		for(String cities:getcities) {
			System.out.println(states.get(cities));
		}
		
		}

}
