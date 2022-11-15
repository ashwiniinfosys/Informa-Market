package string;

public class B {
	
	public static void main(String[] args) {
		String s = "Velocity";
		String s1 = "VELOCITY";
		String s2 = "velo";
		
		String a= "ashwini";
		
		
		//Lastindex of--> it will gives index of duplicate ch
		System.out.println(s.lastIndexOf('o'));//3
		
		System.out.println(a.lastIndexOf('i'));//6
		
		//startwith--> it will check whether string is started with particular character or not
		System.out.println(a.startsWith("a"));// true
		
		
		//endswith--> it will check given string is ends with particular character or not
		System.out.println(a.endsWith("i"));// true
		
		//if we want to breAK THE STRING substring()
		System.out.println(s.substring(2));   //locity
		System.out.println(a.substring(3));   //wini
		
		//how to concat two strings concat()
		System.out.println(s.concat(a));
		
		//relace method will replace the string
		System.out.println(s.replace("city", "rural"));
		
	}

}
