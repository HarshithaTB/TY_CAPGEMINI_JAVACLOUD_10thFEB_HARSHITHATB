package Inheritance;

public class SubClassL1 extends Superclass {
	 
	public String print() 
	 {
			return "some other string";
		}
	public void display()
	{
		System.out.println("diaplay statement is called");
	}
		public static void main(String[]args) {
			Superclass sc1 = new Superclass();
			SubClassL1 scl1=new SubClassL1(); 
			Superclass sc2= new Superclass();
		    SubClassL1 scl12=new SubClassL1();
			
		    
		    System.out.println(sc1.print());
			System.out.println(scl1.print());
			System.out.println(scl12.print());
			
			
			
		}

	}

