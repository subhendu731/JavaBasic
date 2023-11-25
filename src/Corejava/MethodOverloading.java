package Corejava;

public class MethodOverloading {
	
	/*
	 If a class have multiple method with the same name but different data type is
	 called function overloading either argument count should be different or
	 argument data type should be different.
	 */
	
	public void getName(String name) {
		System.out.println("Given name is : "+name);
	}
	
	public void getName(String name, int age) {
		System.out.println("Given name is : "+name);
		System.out.println("Given age is : "+age);
	}

	public static void main(String[] args) {
		MethodOverloading obj=new MethodOverloading();
		obj.getName("Subhendu", 27);
		obj.getName("Subhendu");
	}

}
