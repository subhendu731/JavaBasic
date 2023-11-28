package Corejava;

import java.util.Scanner;

public class PalindromeStringCheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a string : ");
		String input=sc.nextLine();
		String concat="";
		
		for(int i=input.length()-1; i>=0; i--) {
			concat=concat+input.charAt(i);
		}
		
		if(input.equalsIgnoreCase(concat)) {
			System.out.println("'"+input+"' is a Palindrome String.");
		}else {
			System.out.println("Entered string is not a Palindrome String!!");
		}
		
	}

}
