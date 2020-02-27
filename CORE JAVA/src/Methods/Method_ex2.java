package Methods;

public class Method_ex2 {

	public  void displayMessage()
	{
		System.out.println("strat of the display method");
		System.out.println("Hello world");
		System.out.println("end of the display method");
		System.out.println("returning to main method");
	}
	public static void main(String[] args) 
	{
		Method_ex2 obj=new Method_ex2();// creating a reference object
		System.out.println("calling ");
		obj.displayMessage();
		System.out.println("vn,mhvk");

	}

}
