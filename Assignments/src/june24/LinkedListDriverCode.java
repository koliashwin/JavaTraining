package june24;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;

//linklist
//
//
//
//
//1. Write a Java program to insert the specified element at the specified position in the linked list.  
//
//2. Write a Java program to insert elements into the linked list at the first and last position.  
//
//3. Write a Java program to insert the specified element at the front of a linked list.  
//
//4. Write a Java program to insert the specified element at the end of a linked list.  
//
//5. Write a Java program to insert some elements at the specified position into a linked list.  
//
//6. Write a Java program to get the first and last occurrence of the specified elements in a linked list.  
//
//7. Write a Java program to display the elements and their positions in a linked list. 

public class LinkedListDriverCode {
	
	public void menu(LinkedList<String> ar) {
		int ch=-1;
		int idx;
		String element;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("choose one of the operation : ");
		System.out.println(" 1.add \n 2.add First \n 3.add Last \n 4.retrieve \n 5.update \n 6.remove \n 7.search \n 8.firstNlast occuraence \n 9.display \n 0.exit");
		
		
		do {
			
			switch(ch) {
				case 1:{
					System.out.print("Element to add in List :");
					
					element = sc.nextLine();
					ar.add(element);
					System.out.println(element + " is added in list");
					break;
				}
				case 2:{
					System.out.print("Element to add in List :");
					element = sc.nextLine();
					ar.add(0, element);
					System.out.println(element + " is at first position in list");
					break;
				}
				case 3:{
					System.out.print("Element to add in List :");
					element = sc.nextLine();
					idx = ar.size();
					
					ar.add(idx, element);
					System.out.println(element + " is at last position in list");
					break;
				}
				case 4:{
					System.out.print("index : ");
					idx = sc.nextInt();
					sc.nextLine();
					
					System.out.println("Element present at index "+idx+ " : "+ar.get(idx));
					break;
				}
				case 5:{
					System.out.println("Element to be updated :");
					element = sc.nextLine();
					System.out.println("new element :");
					String element2 = sc.nextLine();
					idx=ar.indexOf(element);
					ar.remove(idx);
					ar.add(idx, element2);
					System.out.println(element +" is updated to "+element2);
					break;
				}
				case 6:{
					System.out.println("index of element to be removed : ");
					idx = sc.nextInt();
					sc.nextLine();
					element = ar.remove(idx);
					System.out.println(element+" is removed form list");
					break;
				}
				case 7:{
					System.out.println("Element to be serched : ");
					element = sc.nextLine();
					System.out.println("is present in list :"+ ar.contains(element));
					break;
				}
				case 8:{
					System.out.println("Element to be serched : ");
					element = sc.nextLine();
					System.out.println("first occurance at index 	: "+ar.indexOf(element));
					System.out.println("last occurance at index		: "+ar.lastIndexOf(element));
					break;
				}
				case 9:{
					Iterator t = ar.iterator();
					System.out.println();
					System.out.print("your list : ");
					int i =1;
					while(t.hasNext()) {
						System.out.print(i + "."+ t.next()+" ");
						i++;
					}
					System.out.println();
					break;
				}
				default :
					System.out.println("invalid choiece.");
					break;
			}
			
			System.out.print("choose : ");
			ch = sc.nextInt();
			sc.nextLine();
			System.out.println();
			
		}while(ch !=0);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LinkedList<String> colors = new LinkedList<>();
		colors.add("White");
		colors.add("Red");
		colors.add("Blue");
		colors.add("Black");
		colors.add("Green");
		LinkedListDriverCode obj = new LinkedListDriverCode();
		obj.menu(colors);
	}

}
