package Exceptions;

import java.util.Scanner;

public class CustomExceptionTester 
{

	public static void main(String[] args) throws CustomException 
	{
		Scanner sc=new Scanner(System.in);
		
		int num=sc.nextInt();
		System.out.println("entered number is: " +num);
		if(num>=0 && num<=10) 
		{
			System.out.println(num*10);
		}
		else {
			//System.out.println("it should CustomException");
			throw new CustomException("CustomException: num must not be greater than 10");
		}
			
	}

}
