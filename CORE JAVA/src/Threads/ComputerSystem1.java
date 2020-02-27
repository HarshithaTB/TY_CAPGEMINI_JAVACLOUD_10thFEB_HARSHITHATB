package Threads;



public class ComputerSystem1 extends Thread
{
	PrintingApplication pa;
	public ComputerSystem1(PrintingApplication localpa) {
		this.pa = localpa;
	}
	@Override
	public void run() {
		System.err.println("Printing from computer system1");
		pa.PrintingDocuments("Any document.pdf", 5);
	}
	
}
