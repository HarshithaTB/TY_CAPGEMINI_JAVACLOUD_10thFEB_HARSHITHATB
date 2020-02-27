package Exceptions;
import java.util.Scanner;

public class CustomerExceptionTester1 {
	//in custom exception it is mandatory to write throws exception.

	public static void main(String[] args) throws Throwable 
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("enter the  number: ");
		int num= sc.nextInt();
		try 
		{
			System.out.println(10/num);
		} 
		catch (Exception e) 
		{
			throw new Exception("Any Message");
		}
		
	}

}
