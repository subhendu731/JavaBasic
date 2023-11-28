package Corejava;

import java.util.HashMap;

/*
A HashMap however, store items in "key/value" pairs, 
and you can access them by an index of another type (e.g. a String)
*/

public class HashMapDemo {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashMap<String, Integer> map=new HashMap<String, Integer>();
		map.put("Xyz", 15);
		map.put("Subhendu", 27);
		map.put("Biswas", 12);
		map.put("Biswas", 12);
		map.put("abc", 10);
		
		System.out.println(map.size());
		System.out.println(map);
		
		System.out.println("_____________Print Keys____________________");
		
		for(String getKey: map.keySet()) {
			System.out.println(getKey);
		}
		
		System.out.println("_____________Print Values___________________");
		for(int getValue: map.values()) {
			System.out.println(getValue);
		}
		    
		System.out.println("_____________Print Keys & Values___________________");
		for(String i: map.keySet()) {
			System.out.println("For Key : "+i+", Value is : "+map.get(i));
		}
	}
}
