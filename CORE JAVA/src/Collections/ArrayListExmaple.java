package Collections;

import java.util.ArrayList;

public class ArrayListExmaple {

	public static void main(String[] args) {
		
		ArrayList<Integer> al = new ArrayList<Integer>();//<angular> indicates generic.
	
		al.add(12);
		al.add(14);
		al.add(16);
		al.add(20);
		al.add(22);
		al.add(25);
		al.add(28);
		al.add(34);
		al.add(97);
		al.add(null);
		//al.add(0, 13);
		
		System.out.println("size of array is : " +al.size());
		System.out.println("elements are : " +al);
		System.out.println("*******************************************");
		
		for (int i = 0; i < al.size(); i++) {
			System.out.println("the array list is " +al.get(i));
			
		}
		
		System.out.println("*******************************************");
	   int l = al.remove(2);
		System.out.println("after removal " +al);
		System.out.println("*******************************************");
		System.out.println("at 0th index is : "+al.get(0));
		
		
		//char and string will shows false and it wont convert that to ASCII value
		System.out.println(al.contains(21));
		System.out.println(al.contains(null));
	}

}
