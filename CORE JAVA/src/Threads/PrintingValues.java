package Threads;

public class PrintingValues 
{
	
	public static void main(String[] args) {
		System.out.println("****************Application started**************");
		PrintingMethodClass1 p1 = new PrintingMethodClass1();
		
//		 PrintingMethodClass1().start();
		// Thread t = new Thread(new PrintingMethodClass1());
		p1.start();
		 try {
			 p1.join();
				
			
			} catch (InterruptedException  e) {
				e.printStackTrace();
			}
		 
		 
		 Thread t = new Thread(new PrintingMethodClass2());
		 t.start();
		
		 try {
			 t.join();
				//Thread.sleep(500);
			
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		 
		
		 try {
			 
				t.sleep(1500);
			
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		 
		 
		//new Thread(new PrintingMethodClass2()).start();
		//new PrintingMethodClass2().start();
		System.out.println("***************Application Ended*******************");
		
		
	}

	
	
}
// unless and un-till that black output is executing, 
//the red output wont get executed this is known as "SINGLE THREADING"
