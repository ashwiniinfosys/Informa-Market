package scanner;

import java.util.Scanner;

public class Addition_of_two_No {
public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	
	// to get First No
	System.out.println("Enter First Number");
	 int num1= scan.nextInt();
	 
	 
	 // to get second No
	 System.out.println("Enter Second Number");
	 int num2 = scan.nextInt();
	 
	 // Resultant of two numbers
	 System.out.println(num1*num2);
	
}
}
