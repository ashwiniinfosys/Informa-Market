package collection;

import java.util.ArrayList;

public class ArrayLists {
	public static void main(String[] args) {
		
		ArrayList al= new ArrayList();
		
		al.add("Aditya");
		
		al.add(123);
		
		al.add('A');
		
		al.add(123);
		
		al.add(null);
		
		al.add(null);
		//To print all data
		
		System.out.println(al);
		
		//to get size
		System.out.println(al.size());
		
		// check weather it is empty
		System.out.println(al.isEmpty());
		
		// insertion operation
		
		al.add(3, "Akash");
		System.out.println(al);
		
		// delete operation
		al.remove(1);
		System.out.println(al);
		
	}

}
