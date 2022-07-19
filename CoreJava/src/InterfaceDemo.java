
/*
 * interface
 * 
 * - It is syntatically similar to class but it is no a class.
 * - Since it is not a class so you can't create an object of it.
 * - By default all the methods of the interface are abstract.
 * - To implement abstract methods of an interface class must have to implement that interface using implements keyword.
 *  - One class can implement more than one interface.
 *  - One interface is implemented by more than one class.
 *  - Inheritance of interface is also possible. 
 * 
 * */


interface ifs1
{
	static void meth1()
	{
		System.out.println("Meth1");
	}
}
interface ifs2 extends ifs1
{
	void meth2();
}
public class InterfaceDemo implements ifs2{

	public void meth2() {
		System.out.println("meth2");
	}
	
	public static void main(String[] args) {
		InterfaceDemo i=new InterfaceDemo();
		ifs1.meth1();
		i.meth2();
	}

}
