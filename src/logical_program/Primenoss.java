package logical_program;
//TO print prime nos from 1 to 100
public class Primenoss {
	public static void main(String[] args) {
	int i;
	int j ;
	int count;
	
	
	for(i=2; i<100; i++) {
		count=0;
	//	s= 0;
		for(j=2; j<i; j++) {
			if(i%j==0)
				count=1;
		}
	if(count==0) 
		System.out.print(i);
	
	}}}


