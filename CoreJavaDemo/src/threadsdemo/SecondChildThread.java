package threadsdemo;

public class SecondChildThread implements Runnable {

	Thread myThread;

	public SecondChildThread(String name) {
		// TODO Auto-generated constructor stub
		myThread = new Thread(this);
		myThread.setName(name);
		myThread.start();
		
	}

	@Override
	public void run() {
		for (int j = 1; j <= 7; j++) {
			 System.out.println(myThread.getName()+ " : " + j);
			 
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}

	}

	
}