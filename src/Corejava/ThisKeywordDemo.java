package Corejava;
/*
This keyword demo.........
The this keyword refers to the current object in a method or constructor.
Invoke current class constructor
Invoke current class method
Return the current class object
Pass an argument in the method call
Pass an argument in the constructor call
*/
public class ThisKeywordDemo {
	
	int a=100; //Global variable or instance variable
	
	public void getData() {
		int a=4; //Local variable
		System.out.println("This is local variable value : "+a);
		System.out.println("This is global variable value : "+this.a);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ThisKeywordDemo obj=new ThisKeywordDemo();
		obj.getData();
	}

}
