package Corejava;

/*
Method overriding is used to provide the specific implementation of a method which is already provided by it's superclass.
Method overriding is used for runtime POLYMORPHISM.
*/

public class MethodOverridingChildClass extends MethodOverridingParentClass{
	
	@Override
	public void show() {
		System.out.println("I'm from Child class.");
	}

	
	public static void main(String[] args) {
		/*
		 * If a Parent type reference refers to a Parent object, then Parent's show is
		 * called
		 */
		MethodOverridingParentClass obj1=new MethodOverridingParentClass();
		obj1.show();
		/*
		 * If a Parent type reference refers to a Child object Child's show() is called.
		 * This is called RUN TIME POLYMORPHISM.
		 */
		MethodOverridingParentClass obj2=new MethodOverridingChildClass();
		obj2.show();
	}

}
