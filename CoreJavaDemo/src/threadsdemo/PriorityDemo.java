package threadsdemo;

public class PriorityDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//thread with higher priority is given more preference to use the processor
		// default priority of main is 5
		// default pririty of child thread -  is the same as the priority of its
		// parent at the time of spawning it
		
		HigherPriorityThread t1 = new HigherPriorityThread();
		 LowerPriorityThread t2 = new LowerPriorityThread();
		
		
		t1.MyThread.setPriority(Thread.MAX_PRIORITY);
		t2.MyThread.setPriority(Thread.MIN_PRIORITY);
		
		
		
		
		t1.MyThread.start();
		t2.MyThread.start();
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		t1.MyThread.stop();
		
		t2.MyThread.stop();
		
		
		System.out.println("");
		
	}

}
