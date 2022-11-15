package collection;

import java.util.LinkedList;

public class LinkedLists {
	public static void main(String[] args) {
		LinkedList l= new LinkedList();
		
		l.add(null);
		l.add(123);
		l.add(null);
		l.add(123);
		l.add("Ashwini");
		System.out.println(l);
		// insetion
		l.add(2,"Velocity");
		
		System.out.println(l);
		
		System.out.println(l.isEmpty());
		System.out.println(l.size());
				}

}
