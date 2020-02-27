package Threads;

public class CustomThreadTeaster 
{
	public static void main(String[] args) {
		Object obj1 = new Object();
		Object obj2 = new Object();
		
		new CustomThreads(obj1, obj2).start();
		new CustomThreads1(obj1, obj2).start();
		
	
	}
}
