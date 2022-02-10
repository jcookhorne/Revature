package threadsdemo;

public class ThreadMyDemo implements Runnable{
	
	Thread myDemo;
	
	
	public ThreadMyDemo(String name) {
		myDemo = new Thread(this);// without the this in there nothing will run
		myDemo.setName(name);
		myDemo.start();
		// TODO Auto-generated constructor stub
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for (int i = 5; i>= 0; i--) {
			System.out.println(myDemo.getName()+ " : " + i);
		
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
	}

}
