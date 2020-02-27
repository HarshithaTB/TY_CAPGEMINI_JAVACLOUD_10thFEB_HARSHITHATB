package Exceptions;

public class ExceptionExample 
{

	public static void main(String[] args) 
	{
		
		String str="";
	//System.out.println(str.charAt(3));
	//String index out of bounds exception.
	
	//**Exceptions can be handled by using Try and Catch block.**//
	//**Exception class does not contain any METHODS**//		
	//Checked exception:->compile time exception.in this condition having "catch" and "Throws exception" is Mandatory.
	//UnChecked exception:->run time exception... Not mandatory
	//Exception is the super most class.
		try
		{
			int i=10/0;
			System.out.println(str.charAt(3));
		
			System.out.println(i);
		} 
		catch (StringIndexOutOfBoundsException e) 
		{
			System.out.println("charAt(int index) should not be called on null Strings");
			System.err.println("charAt(int index) should not be called on null Strings");
			System.out.println(e.getClass());//we can get the class name.
			System.out.println(e.getCause());//NULL
			System.err.println(e.getMessage());
			
		}
		catch (Exception e) 
		{
			System.out.println("should not divide by zero");
			System.out.println(e.getCause());//NULL
			System.out.println(e.getClass());
			System.out.println(e.getMessage());
		}
	//**instead of having Multiple catch blocks we can write only one catch block 
	//with only EXCEPTION as argument.**//
	//Multiple catch blocks->Exception should come at very first.
		
//		catch (Exception e) 
//		{
//			System.out.println(" First Exception will executes First in  the code");
//			System.out.println(e.getClass());
//			System.out.println(e.getMessage());
//		}
		
		
	}

}
