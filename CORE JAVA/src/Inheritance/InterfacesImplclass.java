package Inheritance;

public class InterfacesImplclass implements Methodinterface, Anothermethodinterface {

	@Override
	public void displaymessage() 
	{
		System.out.println("overriden displaymessage of Methodinterface");
		
	}

	@Override
	public void printmessage() 
	{
		
		System.out.println("overriden printmessage of Methodinterface");
	}

	@Override
	public void messagedisplay() 
	{
		System.out.println("overriden messagedisplay of Methodinterface");
		
	}
	public static void main(String[]args) 
	{
		//Methodinterface mi=new InterfacesImplclass();
		//Anothermethodinterface ami=new InterfacesImplclass();
		//mi.displaymessage();
		//mi.printmessage();
		//ami.messagedisplay();
		InterfacesImplclass imc=new InterfacesImplclass();
		imc.displaymessage();
		imc.messagedisplay();
		imc.printmessage();
		
	}
     
     
    		 
    	 
    		 
}
