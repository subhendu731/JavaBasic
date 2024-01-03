package Corejava;

public class FinalizeExample {
	
	/*
	 Finalize() is the method of Object class. This method is called just before
	 an object is garbage collected. finalize() method overrides to dispose system
	 resources, perform clean-up activities and minimize memory leaks.
	 
	 Video Link : https://www.youtube.com/watch?v=IaBqm3BEbnU
	*/
	
	public static void main(String[] args) {

		 // Creating an object
		MyObject myObject=new MyObject();
		
		// Setting the reference to null, making the object eligible for garbage collection
		myObject=null;
		
		// Triggering garbage collection
		System.gc();
	}
}

