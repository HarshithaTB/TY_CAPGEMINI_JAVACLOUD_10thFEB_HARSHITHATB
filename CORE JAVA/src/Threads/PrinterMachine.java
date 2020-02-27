package Threads;

public class PrinterMachine {
	public static void main(String[] args) {
		System.out.println("**************Printer Machine Started***************");
		PrintingApplication pa = new PrintingApplication();
		ComputerSystem1 cs1 = new ComputerSystem1(pa);
		ComputerSystem2 cs2 = new ComputerSystem2(pa);
		
		cs1.start();
		
		try {
			cs1.join();// Waits for the thread to die.
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		cs2.start();
		

		try {
			cs2.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
		
		System.out.println("**************Printer Machine stoped***************");
	}

}
