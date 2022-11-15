package scanner;

import java.util.Scanner;

public class Replace_special_c {
public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	
	// To get string name
	String name= scan.next();
	
	String correctname= name.replace("@", "A");
	
	System.out.println(correctname);
}
}
