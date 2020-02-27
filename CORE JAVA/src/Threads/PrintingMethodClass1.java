package Threads;

public class PrintingMethodClass1 extends Thread
{
	public  void run() {
		try {
			Thread.sleep(500);
		} catch (Exception e) {
			e.printStackTrace();
		}
		for (int i = 1; i < 10; i++) {
			System.out.println("printing values : " +i);
			
		}
		
	}
}
