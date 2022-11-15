package scanner;

import java.util.Scanner;

public class Calculator {
public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	 // To get first no 
	System.out.println("Enter first No");
	int a = scan.nextInt();
	
	
	// To get Second No
	System.out.println("Enter second No");
	int b = scan.nextInt();
	
	// Resultant of two No
	
	System.out.println(a*b);
}
}
