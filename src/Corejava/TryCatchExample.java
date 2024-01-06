package Corejava;

public class TryCatchExample {
	
	
	/*
	 * In Java, the try-catch block is used to handle exceptions. It allows you to
	 * enclose a block of code that might throw an exception within the try block.
	 * If an exception occurs during the execution of the try block, it is caught
	 * and handled in the corresponding catch block.
	 * 
	 * Here's a breakdown of how the
	 * try-catch block works:
	 * 
	 * The code that might throw an exception is placed within the try block. If an
	 * exception occurs, the control flow is transferred to the corresponding catch
	 * block. The catch block specifies the type of exception it can catch
	 * (ExceptionType). If an exception of that type occurs, the code within the
	 * catch block is executed. Multiple catch blocks can be used to handle
	 * different types of exceptions. If no exception occurs in the try block, the
	 * catch block is skipped.
	 */
	
	
	public static void main(String[] args) {
			int a=7;
			int b=0;
			
			try {
				int c=a/b;
				System.out.println("Results : "+c);
			}catch(Exception e) {
				e.printStackTrace();
				System.out.println("_____________________________________");
				System.out.println(e.getMessage());
				System.out.println("_____________________________________");
				System.out.println(e.toString());
			}
	}

}
