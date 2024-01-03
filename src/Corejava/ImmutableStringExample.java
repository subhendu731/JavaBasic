package Corejava;

public class ImmutableStringExample {
	
	/*
	 The immutability of strings in Java means that once a String object is
	 created, its value cannot be changed. This has several advantages, as
	 mentioned earlier. Let's look at an example to illustrate the immutability of
	 strings:
	 */
	
	public static void main(String[] args) {
		
		//Creating a string literal
		String str1="Hello";
		
		// Concatenating strings creates a new string
		String str2=str1.concat(" World");
		
		// Original string remains unchanged
		System.out.println("Original String: "+str1);
		
		// New string is created, and str1 is not modified
		System.out.println("Concatenated String: " + str2);
	}
	
	/*
	 In this example, str1 is assigned the value "Hello." When we concatenate it
	 with " World" using the concat method, a new string (str2) is created with
	 the combined value. However, notice that the original string (str1) remains
	 unchanged.
	 */
}
