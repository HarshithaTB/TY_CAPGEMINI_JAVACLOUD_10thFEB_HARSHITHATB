package Inheritance;

public class FunctionalInterfaceImpl implements FunctionalInterfaceex,FunctionalInterfaceEx2 {

	@Override
	public void showMessage() {
		System.out.println("overridden showMessage( of FunctionalInterfaceex)");
		
	}
	public static void main(String[]args) {
		
		FunctionalInterfaceImpl fii =new FunctionalInterfaceImpl();
		fii.showMessage();
		fii.add(5, 4);
		
	
	}
	@Override
	public int add(int i, int j) {
		// TODO Auto-generated method stub
		return 0;
	}
	
	}


