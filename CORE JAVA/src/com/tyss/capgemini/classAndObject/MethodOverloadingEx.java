package com.tyss.capgemini.classAndObject;

public class MethodOverloadingEx 
{
	public static void displaymessage() 
	{
		System.out.println("display message");
		
	}
	public static void displaymessage(String str) //method overloaded
	{
		System.out.println("display message(string str)");
		
	}
	public void  displaymessage(String str,int i) //method overloaded
	{
	System.out.println("displaymessage(String str,int i)");	
	}
	public void  displaymessage(int i,char ch) //method overloaded
	{
	System.out.println("displaymessage(int i,char ch)");	
	}

public static void main(String[] args) 
	{
	MethodOverloadingEx.displaymessage("working");
	displaymessage("hello");
	MethodOverloadingEx .displaymessage("working1");
	
	
		

	}

}
