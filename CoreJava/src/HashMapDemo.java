import java.util.HashMap;

public class HashMapDemo {

	public static void main(String[] args) {
		HashMap hm=new HashMap();
		hm.put(1,"Biren");
		hm.put(2,"Rakesh");
		hm.put(3,"Jigar");
		hm.put(4,"Jay");
		System.out.println(hm);
		System.out.println(hm.get(3));
		System.out.println(hm.values());
		System.out.println(hm.keySet());
		System.out.println(hm.entrySet());
		hm.remove(2);
		System.out.println(hm);
		hm.replace(3, "Rakesh");
		System.out.println(hm);
	
		
	}
}
