package string;

public class A {
	public static void main(String[] args) {
		String s= "dad";
		String rev = "";
		
		for (int i= s.length()-1; i>=0; i--) {
			rev= rev+s.charAt(i);
		}
		System.out.println(rev);
		// to check palindrome
		if(s.equals(rev)) {
			System.out.println("It is Palindrome");
		}
		else {
			System.out.println("Not Palindrome");
		}
	}

}
