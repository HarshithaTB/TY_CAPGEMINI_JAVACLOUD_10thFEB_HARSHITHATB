package Methods;

public class Methodoverridingclass extends Methods {

	
		public  String printMessage( )
		{
			return "non-static Methodoverrridingclass printmessage()";
		}
		
	
		public static String displayMessage()
		{
			return "static displayMessage()";
			
		}
		public static void main(String[]args) {
			System.out.println(new Methodoverridingclass().printMessage());
			System.out.println(displayMessage());
			System.out.println(Methods.displayMessage());
			
		}
	}


