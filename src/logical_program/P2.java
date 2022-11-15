package logical_program;

public class P2 {
	public static void main(String[] args) {
		//verify prime No
		int num = 19;
		//count prime no factors
		int count = 0;
		//use for loop for to check no is 
		for(int i=1; i<=num; i++) {
			if(num%i==0) {
				count++;
			}
		}
		if(count==2) {
			System.out.println("Num is Prime");
		}
		else {
			System.out.println("Num is Not prime");
		}
	}
}
