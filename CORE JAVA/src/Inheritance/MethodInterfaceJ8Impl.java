package Inheritance;

public class MethodInterfaceJ8Impl implements  MethInterface  {

	@Override
	public void displayMessage() {
		System.out.println("overridden displayMessage() of MethInterface");
		
	}

	@Override
	public void printMessage() {
		System.out.println("overridden printMessage() of MethInterface");
		
	}
	public static void main(String[]args) 
	{
		MethodInterfaceJ8Impl mi= new MethodInterfaceJ8Impl();
		mi.displayMessage();
		mi.printMessage();
		mi.defaultMethodMessage();
		
	}

}
