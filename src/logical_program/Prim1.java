package logical_program;

public class Prim1 {
	public static void main(String[] args) {
		int num= 71;
		int count =0;
		for(int i=1; i<=num; i++) {
			if(num%i==0) {
				count++;
				
			}
		}
		if(count==2) {
			System.out.println("It is prime Number");
		}
		else {
			System.out.println("It is Not Prime Number");
		}
	}

}
