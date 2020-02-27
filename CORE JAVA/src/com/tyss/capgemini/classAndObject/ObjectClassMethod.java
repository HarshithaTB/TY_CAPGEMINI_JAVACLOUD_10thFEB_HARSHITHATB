package com.tyss.capgemini.classAndObject;

public class ObjectClassMethod {

	public static void main(String[] args) {
		ObjectClassMethod ocm1=new ObjectClassMethod();
		ObjectClassMethod ocm2=new ObjectClassMethod();
		
		System.out.println(ocm1.getClass());//returntype=object
		System.out.println(ocm2.hashCode());//int
		System.out.println(ocm1.equals(ocm2));//boolean
		
		System.out.println(ocm1.toString());
		System.out.println(ocm1);
		System.out.println(ocm2.toString());
		System.out.println(ocm2);
		// method can be used anywhere btwe cannot use the methods from other pacakge
		//if to use we need to import.


	}

}
