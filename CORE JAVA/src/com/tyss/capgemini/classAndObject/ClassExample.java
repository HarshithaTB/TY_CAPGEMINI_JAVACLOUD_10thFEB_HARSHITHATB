package com.tyss.capgemini.classAndObject;

public class ClassExample 
{
	public ClassExample() //No argument constructor
	{
		System.out.println("no-argument constructor...");
		
	}
	//Java compiler does not allow more than one no argument constructor
	public ClassExample(String str)
	{
		System.out.println("parameterized constructor with one argument...");
	}
	//we can have n num of parameterized constructor bt with different datatypes. 
	//bt we can call it as constructor overloading
	public ClassExample( int i,char ch)
	{
		System.out.println("parameterized constructor with multiple argument...");
	}

	
public static void main(String[] args) {
		ClassExample ex=new ClassExample();
		//Each and every  concrete class will have a default constructor.
		ClassExample ex1=new ClassExample("Any string");
		ClassExample ex2=new ClassExample(12345,'h');
		//ClassExample ex3=new ClassExample(12345,"hii...");
	}

}
