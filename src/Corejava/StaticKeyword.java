package Corejava;

public class StaticKeyword {
	
	
	 String name="Subhendu";	//instance variable
	 static int salary=5000;
	 
	 
	 public StaticKeyword(int salary) { //Parameterized constructor
		 this.salary=salary;	//assigning value of current class instance variable to local variable
	 }
	 
	 public void display() {
		 System.out.println("Name : "+name+" and Updated Salary : "+salary);
	 }
	 
	 public static void show() {
		 System.out.println("Default Salary : "+salary);	//Static method will accept only static variable
	 }
	 

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StaticKeyword.show();
		StaticKeyword obj=new StaticKeyword(7000);
		obj.display();	//static method can only be called using class name
	}

}
