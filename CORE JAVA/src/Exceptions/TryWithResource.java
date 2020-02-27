package Exceptions;

import java.util.Scanner;

public class TryWithResource 
{

	public static void main(String[] args) 
	{
		
		try(Scanner sc = new Scanner(System.in)) 
		{
			int i=10;
			int j=sc.nextInt();
			System.out.println(i/j);
			
			if(i==j)
				System.out.println("should not divide the number by zero");
			else
			{
				System.out.println(i/j);
			}
		}
			
		
//		catch (Exception e) 
//		{
//			System.out.println("should not divide the number by zero(0)");
//			System.out.println(e.getMessage());
//		}
	}

}
