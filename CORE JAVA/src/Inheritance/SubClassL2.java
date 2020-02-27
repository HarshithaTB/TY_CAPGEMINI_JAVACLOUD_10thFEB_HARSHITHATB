package Inheritance;

public class SubClassL2 extends SubClassL1 {
	
	public  void display() {
		super.display();
		super.i=12;
		System.out.println("over ridden display in subclass L2");
		
	}
	
	public String print() 
	{
		System.out.println("overriedden print() of subclassL1 in subclassL2");
		return super.print();
	}
	
public static void main(String[] args) {
	
	SubClassL2 scL2=new SubClassL2 ();
	scL2.display();
	System.out.println(scL2.print());
	System.out.println("i of super class" + scL2.i);
		

	}

}
