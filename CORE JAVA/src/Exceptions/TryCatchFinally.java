package Exceptions;

public class TryCatchFinally {

	public static void main(String[] args) 
	{
		try {
			System.out.println(10/0);
			System.exit(0);
		} 
		catch (Exception e)
		{
		System.out.println("Exception found in code");
		System.exit(0);//Jvm will shut down at this statement.so finally block wont execute
		}
		
		finally 
		{
			System.out.println("code to be executed be there any exception or not");
		}
		// if we are not handling the exception default exception handler is executed
		System.out.println("code");
		//** Anyhow finally block will get executed but if we write "system.exit"  
		//**in catch block then it will terminates and finally block wont get executed.
	}
	

}
