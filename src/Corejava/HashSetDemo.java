package Corejava;

import java.util.HashSet;
import java.util.Iterator;

//Print list of values using Iterator

public class HashSetDemo {

	public static void main(String[] args) {
		/*
		 * HashSet does not allow duplicate values 
		 * There is no guarantee that elements stored in sequential order
		 */
		HashSet<String> hs=new HashSet<String>();
		hs.add("Chennai");
		hs.add("Kolkata");
		hs.add("Bangalore");
		hs.add("Chennai");
		
		System.out.println(hs);
		System.out.println(hs.size());
		
		Iterator<String> i = hs.iterator();
		while(i.hasNext()) {
			System.out.println(i.next());
		}	
	}
}
