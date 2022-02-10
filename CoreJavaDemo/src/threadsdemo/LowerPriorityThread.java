package threadsdemo;

public class LowerPriorityThread implements Runnable {
	int counter;
	Thread MyThread;
	public LowerPriorityThread() {
		MyThread = new Thread(this);
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		while (true) {
			counter ++ ;
		}
	}

}
