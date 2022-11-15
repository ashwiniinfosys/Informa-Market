package string;

public class Palindrome {// class open
public static void main(String[] args) {// MBO

String org = "NITIN";
String rev="";

for(int i= org.length()-1; i>=0; i--) {
	
	rev= rev+org.charAt(i);
	
}
System.out.println(rev);
// to check weather the string is Palindrome or not

if(org.equals(rev)) {
	System.out.println("It is Palindrome");
}
else {
	System.out.println("Not Palindrome");
}
}// MBC
}// class closed