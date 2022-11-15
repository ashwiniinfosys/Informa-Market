package Exception;

public class Arithmatic_E {

	public static void main(String[] args) {
		int a= 10;
		int b= 0;
		
		try {
			int c= a/b;
		} catch (ArithmeticException e) {
			// TODO: handle exception
			System.out.println("Hey Please ENTER VALID DENOMINATOR");
		}
	}
}
