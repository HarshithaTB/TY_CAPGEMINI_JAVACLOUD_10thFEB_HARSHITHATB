package Inheritance;

public interface MethInterface {
	public void displayMessage();
	public void printMessage();
	public static void showMessage() 
	{
		System.out.println("public static showMessage()of Methodsinterface.... ");
	}
	default void defaultMethodMessage() //we cannot use static in this case we get illegal combination.
	
	{
		
	System.out.println("defaultMethodMessage() of Methodsinterface");
		
    }

}
