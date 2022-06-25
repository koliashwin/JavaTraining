package june24;

import java.util.TreeMap;

//8. Write a Java program to get a key-value mapping associated with the greatest key and the least key in a map.  
//
//9. Write a Java program to get the first (lowest) key and the last (highest) key currently in a map.  
//
//10. Write a Java program to get a reverse order view of the keys contained in a given map. 

public class TreeMapOperations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		TreeMap<Integer, String> map = new TreeMap<>();
		
		map.put(1, "Ashwin Koli");
		map.put(4, "Vaibhav Koli");
		map.put(3, "Akash Bamble");
		map.put(2, "Vaibhav Suryawanshi");
		
		System.out.println("Dictionary 	: "+map);
		System.out.println("Greatest key : "+map.lastKey());
		System.out.println("Lowest key : "+map.firstKey());
		System.out.println("Greatest key-value pair : "+map.lastEntry());
		System.out.println("Lowest key-value pair	: "+map.firstEntry());
		System.out.println("Reverse order : "+map.descendingMap());
		
	}

}
