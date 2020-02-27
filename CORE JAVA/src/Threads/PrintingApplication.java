package Threads;

public class PrintingApplication {
	public void PrintingDocuments(String doc, int numofcopies) {
		
		for (int i = 1; i < numofcopies; i++) {
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("Printing " + doc+ "#" +i);
			
		}
	}

}
