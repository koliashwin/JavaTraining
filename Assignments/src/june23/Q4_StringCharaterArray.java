package june23;
//4. Write a Java program to create a new String object with the contents of a character array.
public class Q4_StringCharaterArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		char[] ch = {'a','r','e','p'};
		
		String s = String.copyValueOf(ch);
		
		System.out.println("the spelling '"+s+"' is weired");
		
		
	}

}
