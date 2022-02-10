package threadsdemo;

public class HigherPriorityThread implements Runnable{
	int counter;
	Thread MyThread;
	public HigherPriorityThread() {
		 MyThread = new Thread(this);
	}
	
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		
		while(true) {
			counter++;
		}
		
		
		
		
		
	}

}
