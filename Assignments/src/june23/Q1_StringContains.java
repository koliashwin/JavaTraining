package june23;
// 1. Write a Java program to test if a given string contains the specified sequence of char values. 

public class Q1_StringContains {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s1 = "I am ashwin koli";
		String s2 = "ashwin";
		
		System.out.println("String : "+ s1);
		System.out.println("Search : "+ s2);
		System.out.println("It exists : "+ s1.contains(s2));
	}

}
