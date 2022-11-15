package scanner;

import java.util.Scanner;

public class Special_symbolsremove {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		// to enter name
		System.out.println("enter string");
		
		String name =s.next();
		
	
		String c = name.replaceAll("$o$", "SoS");

		System.out.println(c);
	 }

	
}
