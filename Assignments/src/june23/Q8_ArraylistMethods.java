package june23;

import java.util.ArrayList;

//Write A arraylist program using these methods
//
//
//size()    Returns the length of the arraylist.
//sort()    Sort the arraylist elements.
//clone()    Creates a new arraylist with the same element, size, and capacity.
//contains()    Searches the arraylist for the specified element and returns a boolean result.
//ensureCapacity()    Specifies the total element the arraylist can contain.
//isEmpty()    Checks if the arraylist is empty.
//indexOf()    Searches a specified element in an arraylist and returns the index of the element.

public class Q8_ArraylistMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		list.add(78);
		list.add(1);
		list.add(54);
		list.add(90);
		
		ArrayList<Integer> newList = (ArrayList<Integer>) list.clone();
		
		list.ensureCapacity(10);
		
		System.out.println("is list empty : "+list.isEmpty());
		System.out.println("list elements : "+list);
		System.out.println("list size : "+list.size());
		System.out.println("Cloned list :"+ newList);
		System.out.println("is 1 exist in list : " + list.contains(1));
		System.out.println("Index of 1 :"+ list.indexOf(1));
		
	}

}
