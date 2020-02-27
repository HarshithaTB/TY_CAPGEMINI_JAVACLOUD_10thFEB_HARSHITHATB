package Methods;
//Methods are declared with name and have return type as VOID
//We cannot cerate a method inside a method


public class Method1 
{

	public static void displayMessage() 
	{
		System.out.println("Execution comes to displayMessage method");
		
		System.out.println("Hello");
		System.out.println("end of displayMesage");
	}
	public static void main(String[]args)//ctrl sft forward slash
	{
		System.out.println("displayMessage is called");
		displayMessage();//calling method
		System.out.println("end of main method");
	}
	
}
