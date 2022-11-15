package collection;

import java.util.HashSet;

public class Hashset {
	public static void main(String[] args) {
		HashSet hs = new HashSet();
		
		hs.add(null);
		hs.add(123);
		hs.add("Aishu");
		hs.add(100);
		hs.add(123);
		hs.add("Ashu");
		hs.add(null);
		
		System.out.println(hs);
		System.out.println(hs.size());
		System.out.println(hs.isEmpty());
		// clear method
		hs.clear();
		System.out.println(hs);
	}

}
