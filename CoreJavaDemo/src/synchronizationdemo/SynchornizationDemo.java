package synchronizationdemo;

public class SynchornizationDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Printer commonPrinter = new Printer();
		PrintRequestThread req1 = new PrintRequestThread(commonPrinter, "hello");
		PrintRequestThread req2 = new PrintRequestThread(commonPrinter, "World");
		PrintRequestThread req3 = new PrintRequestThread(commonPrinter, "java");
	
	
		
		
		
		req1.myThread.start();
		req2.myThread.start();
		req3.myThread.start();	
	

		
		try {
			req1.myThread.join();
			req2.myThread.join();
			req3.myThread.join();	
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	
		
	
	}

}
