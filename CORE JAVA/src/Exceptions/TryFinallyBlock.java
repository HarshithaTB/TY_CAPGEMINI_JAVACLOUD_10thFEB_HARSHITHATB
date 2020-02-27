package Exceptions;

public class TryFinallyBlock {

	public static void main(String[] args) 
	{
		try 
		{
			System.out.println(10/0);
		} 
		finally 
		{
			System.out.println("code inside Finally block");
		}
		
		//we can't write finally block inside another finally block
		//Try, Multiple Catch and Finally
		//Try, Catch and Finally
		//multiple Try
		//Multiple Finally are not possible
		// we can't use Try without Catch because catch only used to  handle EXCEPTION.
		
	}

}
