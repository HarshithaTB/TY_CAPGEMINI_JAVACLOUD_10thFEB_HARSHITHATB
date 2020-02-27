package Threads;

public class PrintingMethodClass2 extends Thread {
	public  void run () {
		for (int i = 1; i < 10; i++) {
			System.err.println("printing values : " +i);
			
		}
		
	}

	public void start() {
		// TODO Auto-generated method stub
		
	}

}
