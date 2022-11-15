package logical_program;

public class P1 {
	// prime no has two factors i.e ->>> i & num itself
	
	public static void main(String[] args) {
		int num= 17;
		int count =0;
		for(int i=1; i<=num; i++) {
			//to find out reminder
			if (num%i==0) {
				count++;
			}
		}//end for loop
		
		//count factors
		if (count==2) {
			System.out.println("Num is Prime");
		}
	}
}
