package Threads;

public class CustomThreads1 extends Thread {
	Object obj1;
	Object obj2;
	
	public CustomThreads1(Object obj1,Object obj2) {
		this.obj1 = obj1;
		this.obj2 = obj2;
	}
		@Override
	    public void run() {
		synchronized (obj2) {
			System.out.println(obj2);
//			try {
//				  Thread.sleep(500);
//			} catch (Exception e) {
//				e.printStackTrace();
//			}
//			
//		}
		synchronized (obj1) {
			System.out.println(obj1);
			obj1.notify();
			
			
		}

	}
		}
}


