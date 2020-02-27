package Collections;

import java.util.Collection;
import java.util.Collections;

public class CustomListExecuter {

	public static void main(String[] args) {

		CustomList cl = new CustomList( 4 );
		cl.add("1");
		cl.add("12");
		cl.add("3");
		cl.add("4");
	    cl.add("5");
		cl.add("6");
		System.out.println(cl.size());
		System.out.println("***************************************************************");
		
		
		for (int i = 0; i < cl.size(); i++) {
			System.out.println("Element at " +i + " index : " + cl.get(i));
			
		}
		System.out.println("*****************************************************************");
		 boolean h = cl.contains("12");
		 System.out.println("customList .contains(12) is " + h);
		 System.out.println("****************************************************************");
		 System.out.println(cl.get(12));
	}

}
