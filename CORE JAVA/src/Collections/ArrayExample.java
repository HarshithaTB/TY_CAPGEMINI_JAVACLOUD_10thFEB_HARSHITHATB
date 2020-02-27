package Collections;

public class ArrayExample {

	public static void main(String[] args) {
	int[] intArray1 = new int [6];
	//int intArray2[] = new int [6]:-> it is not the proper way of creating an array
	// Array is a collection of the buckets
	intArray1[0] = 1;
	intArray1[1] = 2;
	intArray1[2] = 3;
	intArray1[3] = 4;
	intArray1[4] = 5;
	intArray1[5] = 6;
	//Interger.parseInt("1234564789");
	
	
	for (int i = 0; i < intArray1.length; i++) {
		System.out.println("Element at the index : " +i+ "=" + intArray1[i]);
		
	}
	
	

	}

}
