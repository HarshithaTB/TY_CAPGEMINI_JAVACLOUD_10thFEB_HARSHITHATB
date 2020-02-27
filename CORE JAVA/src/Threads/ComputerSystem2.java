package Threads;

public class ComputerSystem2 extends Thread
{
	PrintingApplication pa;
	public ComputerSystem2(PrintingApplication localpa) 
	{
		this.pa = localpa;
	}
	@Override
	public void run() {
		System.err.println("Printing from computer system2");
		pa.PrintingDocuments("some document.pdf", 5);
	}
}
