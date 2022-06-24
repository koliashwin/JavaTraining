package june24;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListOperations {
	
	public void add(ArrayList<String> ar, String s) {
		ar.add(s);
	}
	
	public void display(ArrayList<String> ar) {
		Iterator t = ar.iterator();
		
		while(t.hasNext()) {
			System.out.println(t.next());
		}
	}
	
	public void addAtIndex(ArrayList<String> ar, String s, int idx) {
		ar.add(idx, s);
	}
	
	public String getByIndex(ArrayList<String> ar, int idx) {
		 
		return ar.get(idx);
	}
	
	public void update(ArrayList<String> ar, String old, String newElement) {
		int idx = ar.indexOf(old);
		ar.remove(idx);
		ar.add(idx, newElement);
	}
	
	public void removeAtIndex(ArrayList<String> ar, int idx) {
		ar.remove(idx);
		
	}
	
	public boolean search(ArrayList<String> ar, String s) {
		return ar.contains(s);
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<String> colors = new ArrayList<>();
		ArrayListOperations obj = new ArrayListOperations();
		
		colors.add("White");
		colors.add("Red");
		colors.add("Blue");
		colors.add("Black");
		colors.add("Green");
		
		obj.addAtIndex(colors, "abc",0);
		obj.add(colors, "Yellow");
		System.out.println("exist : "+obj.search(colors, "abc"));
		obj.display(colors);
//		obj.getByIndex(colors, 3);
		System.out.println("this thing : "+obj.getByIndex(colors, 0));
		
		obj.update(colors, "abc", "orange");
		obj.removeAtIndex(colors, 2);
		obj.display(colors);
		obj.search(colors, "abc");
		
	}

}
