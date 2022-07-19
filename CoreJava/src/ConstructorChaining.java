
/*
 * Polymorphism
 * 
 * 1. Compile Time (Method Overloading) : When there is a more than one method in a single class having the same name
 * but with different number of arguments and their data types, then it is called method overloading.
 * 
 *  2. Run Time (Method Overriding) : When there is a same method prototype in your both base class and derived class
 *  and if you call that method using the object of derived class, then only derived class method will be called. So
 *  you can say that method of derived class overrides the method of base class. 
 * 
 * 
 * 	super : Always use in derived class.
 * 	You can access variables, methods and constructor from your derived class to immediate base class.
 * */

class A1
{
	A1()
	{
		System.out.println("A1's Default Constructor");
	}
	void show()
	{
		System.out.println("Show From A1");
	}
}
class B1 extends A1
{
	B1()
	{
		System.out.println("B1's Default Constructor");
	}
	void show()
	{
		super.show();
		System.out.println("Show From B1");
	}
}
class C1 extends B1
{
	C1()
	{
		System.out.println("C1's Default Constructor");
	}
	void show()
	{
		super.show();
		System.out.println("Show From C1");
	}
}
public class ConstructorChaining {

	public static void main(String[] args) {
		C1 c=new C1();
		c.show();
	}
}
