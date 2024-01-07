package Corejava;

import java.util.HashSet;
import java.util.Iterator;

//Print list of values using Iterator

public class HashSetDemo {

	public static void main(String[] args) {
		/*
		 * 1. HashSet does not allow duplicate values 
		 * 2. Allow only single null value
		 * 3. It is comparatively slower than HashMap
		 * 4. There is no guarantee that elements stored in sequential order
		 * 5.
		 */
		HashSet<String> hs=new HashSet<String>();
		hs.add("Kolkata");
		hs.add("Bangalore");
		hs.add("Chennai");
		hs.add("Chennai");
		
		System.out.println(hs);
		System.out.println(hs.size());
		
		Iterator<String> i = hs.iterator();
		while(i.hasNext()) {
			System.out.println(i.next());
		}	
	}
}
