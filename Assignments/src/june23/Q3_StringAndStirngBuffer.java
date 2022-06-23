package june23;
//3. Write a Java program to compare a given string to the specified string buffer. 
public class Q3_StringAndStirngBuffer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s = "ashwin";
		StringBuffer sb = new StringBuffer("ashwin");
		
		System.out.println("String 		: "+s+"\nStringBuffer 	: "+sb);
		
		System.out.println("Is the content equal 	: "+ s.contentEquals(sb) );
		System.out.println("Is HashCode equal 	: "+ s.equals(sb) );
		
		System.out.println("StringCode 		: "+s.hashCode()+"\nStringBufferCode 	: "+sb.hashCode());
	}

}
