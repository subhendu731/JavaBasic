package Corejava;

import java.util.Arrays;

public class SortStringsFromList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String[] list={"Jan", "Feb", "Mar", "Apr"};
		SortStringsFromList.print(list);
		
		System.out.println("___________After Sorting_____________");
		
		Arrays.sort(list);
		SortStringsFromList.print(list);
	}
	
	
	
	public static void print(String[] list) {
		for(String i: list) {
			System.out.println(i);
		}
	}

}
