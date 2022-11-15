package collection;

import java.util.Vector;

public class Vectors {
	public static void main(String[] args) {
		Vector v = new Vector();
		
		v.add("Parisa");
		
		v.add("Velocity");
		
		v.add(null);
		
		v.add(500);
		
		v.add("Parisa");
		
		v.add(500);
		
		v.add(null);
		
		System.out.println(v);
		
	//size of vector
		System.out.println(v.size());
	// empty
		System.out.println(v.isEmpty());
	//Insertion
		v.add(3, "Pune");
		System.out.println(v);
		
		//remove
		v.remove(3);
		System.out.println(v);
		
		
		}

}
