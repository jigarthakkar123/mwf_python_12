import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class ArrayListDemo {

	public static void main(String[] args) {
		ArrayList al=new ArrayList();
		al.add(10);
		al.add(10.10);
		al.add("tops");
		al.add('t');
		al.add(10);
		al.add(true);
		al.add(null);
		
		System.out.println(al);
		System.out.println(al.get(3));
		System.out.println(al.indexOf(true));
		System.out.println(al.isEmpty());
		System.out.println(al.lastIndexOf(10));
		System.out.println(al.remove(3));
		System.out.println(al);
		System.out.println(al.set(3,100));
		System.out.println(al);
		System.out.println(al.size());
		
		Iterator itr=al.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
		ListIterator litr=al.listIterator();
		while(litr.hasNext())
		{
			litr.set(litr.next()+" Tops");
		}
		System.out.println("Iterate Using List Iterator");
		litr=al.listIterator();
		while(litr.hasNext())
		{
			System.out.println(litr.next());
		}
		
		System.out.println("List Data In Reverse");
		while(litr.hasPrevious())
		{
			System.out.println(litr.previous());
		}
	}
}
