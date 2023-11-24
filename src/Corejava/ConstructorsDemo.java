package Corejava;

public class ConstructorsDemo {
	
	 /* 1. Constructor will not return any values 
	   	2. Name of the Constructors should be always Class Name only
	 */
	
	public ConstructorsDemo() { //Default Constructor
		System.out.println("Default constructor.");
	}
	
	public ConstructorsDemo(String a, int i) { // Parameterized Constructor
		System.out.println("Parameterized Constructor a="+a+" and i="+i);
	}

	public static void main(String[] args) {
		//Once we create an object, Constructor will call automatically
		ConstructorsDemo obj=new ConstructorsDemo();
		ConstructorsDemo obj2=new ConstructorsDemo("Hello", 5);
	}
}
