package Collections;

import java.util.Arrays;

public class ArrayClassExample 
{

	

	public static void main(String[] args) 
	{
		int[] a1 = {10, 20, 30, 40, 520, 630, 85, 25 ,24, 48};
		Arrays.parallelSort(a1);;
		for (int i = 0; i < a1.length ; i++) 
			
		{
			System.out.println("Decending order : " +a1[i]);
		
		}
		
		
	}

}
