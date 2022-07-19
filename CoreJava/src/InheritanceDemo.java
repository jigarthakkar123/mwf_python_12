import java.util.Scanner;

/*
 * Inheritance: The object of one class aquire the properties of object of another class is called
 * Inheritance.
 * 
 *  - Creating a new class from an existing class is called inheritance.
 *  
 *  Types of Inheritance
 *  
 *  1. Single
 *  2. Multilevel
 *  3. Multiple
 *  4. Heirarchical
 *  5. Hybrid
 * 
 * 
 * */
class A
{
	int a;
	void getA()
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter A: ");
		a=sc.nextInt();
	}
	void putA()
	{
		System.out.println("A : "+a);
	}
}
class B extends A
{
	int b;
	void getB()
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter B: ");
		b=sc.nextInt();
	}
	void putB()
	{
		System.out.println("B : "+b);
	}
}
class C extends A
{
	int c;
	void getC()
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter C: ");
		c=sc.nextInt();
	}
	void putC()
	{
		System.out.println("C : "+c);
	}
}
public class InheritanceDemo {

	public static void main(String[] args) {
		B b1=new B();
		C c1=new C();
		b1.getA();
		b1.getB();
		c1.getC();
		b1.putA();
		b1.putB();
		c1.putC();
	}
}
