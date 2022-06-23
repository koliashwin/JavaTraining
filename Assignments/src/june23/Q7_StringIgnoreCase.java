package june23;
//7 Write a Java program to compare a given string to another string, ignoring case considerations. 
public class Q7_StringIgnoreCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s1 = "ashwin";
		String s2 = "ASHWIN";
		
		System.out.println("Comparing : ("+s1+") and ("+s2+")");
		
		System.out.println("Its matching : "+s1.equalsIgnoreCase(s2)); 

	}

}
