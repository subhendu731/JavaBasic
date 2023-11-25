package Corejava;

/*The super keyword refers to superclass (parent) objects.
It is used to call superclass methods, and to access the superclass constructor.
The most common use of the super keyword is to eliminate the confusion 
between super classes and subclasses that have methods with the same name.
*/
public class SuperKeywordChildDemo extends SuperKeywordParentDemo{
	
	String name="Child Class";
	
	public void getStringData() {
		System.out.println(name);
		System.out.println(super.name);
	}
	
	@Override
	public void getData() {
		System.out.println("Child class method.");
		super.getData();
	}
	
	public SuperKeywordChildDemo() {
		super(); //Super constructor keyword should be always at first line for Constructor
		System.out.println("Child class constructor.");
	}
	
	public static void main(String[] args) {
		SuperKeywordChildDemo obj=new SuperKeywordChildDemo();
		obj.getStringData();
		obj.getData();
	}
}
