package june23;
// 2. Write a Java program to compare a given string to the specified character sequence. 

public class Q2_StringCompare {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s1 = "ashwin";
		String s2 = "Ashwin";
		
		System.out.println("Comparing : ("+s1+") and ("+s2+")");
		
		System.out.println("Its matching : "+s1.compareToIgnoreCase(s2)); 
//		prints the lexicographic value if its 0 --> 2 strings are same
//		System.out.println("Found perfect match : "+ s1.compareTo(s2));
		
		System.out.println("Found perfect match : "+ s1.equals(s2));
		
	}

}
