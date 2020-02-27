package Inheritance;

public interface FunctionalInterfaceex 
{
//void printMessage();
//void displayMessage();
public void showMessage();//it should have only one abstract method.

public static void printMessage() {
	System.out.println("printMessage() of functionalinterfaceex");
	
	
}
public static void displayMessage() {
	System.out.println("displayMessage() of functionalinterfaceex");
	
}

int add(int i, int j);
}
