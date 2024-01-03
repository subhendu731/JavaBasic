package Corejava;

import java.util.ArrayList;

public class ArrayListExample {

	public static void main(String[] args) {
		
		// Creating an ArrayList of Strings
		ArrayList<String> arrayList=new ArrayList<>();
		
		// Adding elements to the ArrayList
        arrayList.add("Java");
        arrayList.add("Python");
        arrayList.add("C++");
        arrayList.add("JavaScript");
        
        // Accessing elements using for-each loop
        System.out.println("1. Elements in the ArrayList:");
        for(String array: arrayList) {
        	System.out.println(array);
        }
        
        // Adding an element at a specific index
        arrayList.add(2, "Ruby");
        System.out.println("2. New ArrayList: "+arrayList);
        
        // Checking if an element is present
        System.out.println("3. Is C++ present in the ArrayList? " + arrayList.contains("C++"));
        
        // Getting the size of the ArrayList
        System.out.println("4. Size of the ArrayList: " + arrayList.size());
        
        // Checking if the ArrayList is empty
        System.out.println("5. Is the ArrayList empty? " + arrayList.isEmpty());
        
        // Clearing all elements from the ArrayList
        arrayList.clear();

        // Checking after clearing the ArrayList
        System.out.println("6. Is the ArrayList empty? " + arrayList.isEmpty());
	}
}
