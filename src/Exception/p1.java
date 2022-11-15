package Exception;

public class p1 {
public static void main(String[] args) {
	int a= 10;
	int b= 0;
	try {
		int c= a/b;
	} catch (ArithmeticException e) {
		// TODO: handle exception
		System.out.println("Arithmetic Exception Handled");
	}
}
}
