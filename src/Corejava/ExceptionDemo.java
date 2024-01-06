package Corejava;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class ExceptionDemo {

	/*
	 * In Java, an exception is an event that occurs during the execution of a
	 * program, disrupting the normal flow of the program's instructions. When an
	 * exceptional situation arises, an object representing that exception is
	 * thrown. The program can then catch and handle the exception, allowing for
	 * more graceful error recovery.
	 * 
	 * Java divides exceptions into two categories:
	 * 
	 * 1. Checked Exceptions (Compile-time Exceptions): These are exceptions that
	 * the Java compiler requires you to handle explicitly in your code by using
	 * try, catch, and finally blocks. They are subclasses of Exception but not
	 * subclasses of RuntimeException. Examples include IOException, SQLException,
	 * etc.
	 * 
	 * 2. Unchecked Exceptions (Runtime Exceptions): These are exceptions that occur
	 * during the execution of a program but are not explicitly checked by the
	 * compiler. They are subclasses of RuntimeException. Examples include
	 * NullPointerException, ArrayIndexOutOfBoundsException, and
	 * ArithmeticException.
	 */

	public static void main(String[] args) {
		ExceptionDemo ed = new ExceptionDemo();
		ed.uncheckedExceptions();
	}

	public void uncheckedExceptions() {
		int a = 7;
		int b = 0;
		int c = a / b;
		System.out.println("Results : " + c);
	}

	/*
	 * In this below example, the FileReader constructor may throw an IOException, so it
	 * needs to be handled with a try-catch block.
	 */
	public void checkedException() {
		try {
			FileReader file = new FileReader("example.txt");
			// Read from the file
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
