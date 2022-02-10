package synchronizationdemo;

public class Printer {

	synchronized public void print(String msg) {
		// TODO Auto-generated method stub
		//[msg]
		System.out.print("[");
		System.out.print(msg);
	
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("]");
		
	}

}
