package Exceptions;

public class CustomException extends RuntimeException 
{
	//@SuppressWarnings("serials")//to remove lines
	
	public CustomException(String message) {
		super(message);
		System.out.println("CustomException");
	}
	
}
