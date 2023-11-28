package Corejava;

import java.util.Scanner;

public class ReverseNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter an integer : ");
		int input=sc.nextInt();
		int b=0;
		
		while(input>0) {
			int a=input%10;
			b=b*10+a;
			input=input/10;
		}
		System.out.println("Reverse of entered integer is : "+b);
	}
}
