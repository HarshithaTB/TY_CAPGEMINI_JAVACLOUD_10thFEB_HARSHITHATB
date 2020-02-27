package Polymorphism;

public class MethodInterfaceCaller {

	public static void main(String[] args) {
		MethodOverridingClass1 moc1 = new MethodOverridingClass1();
		MethodOverridingClass2 moc2 = new MethodOverridingClass2();
		System.out.println(moc1.displayMessage());
		System.out.println(moc1.printMessage());
		
		System.out.println("*********************************************");
		
		System.out.println(moc2.displayMessage());
		System.out.println(moc2.printMessage());

	}
}
