package Inheritance;

import Methods.Method1;

public class DifferentPackageEx extends Method1 {

	public static void main(String[] args) {
	//Method1.displayMessage();
		displayMessage();//example for multilevel inheritance
		DifferentPackageEx dp= new DifferentPackageEx();
		{
			System.out.println(dp.toString());
			System.out.println(dp.hashCode());
			//System.out.println(dp.equals(obj));
			
			System.out.println();


	}

}
	}
