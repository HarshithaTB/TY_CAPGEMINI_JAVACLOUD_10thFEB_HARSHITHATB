package Polymorphism;

public class OverLoadedMethodCallingClass {

	public static void main(String[] args) 
	{ 
		OverloadedMethodCLass omc = new OverloadedMethodCLass();
		System.out.println("add( int i , int j):" + omc.add (5,6));
		System.out.println("add( int i , int j , int k):" + omc.add(5, 10, 15));
		System.out.println("add(int i, double d): " + omc.add(10, 3.5));

	}

	

}
