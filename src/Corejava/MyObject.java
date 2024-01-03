package Corejava;

public class MyObject {
	
	public MyObject() {
		System.out.println("Object created.");
	}
	
	// Finalize method is called by the garbage collector before the object is garbage-collected
	 
	protected void finalize() throws Throwable {
		try {
			// Cleanup operations go here
			System.out.println("Finalize method called. Object destroyed.");
		}finally {
			// Call the finalize method of the superclass (Object class)
			super.finalize();
		}
	}
}
