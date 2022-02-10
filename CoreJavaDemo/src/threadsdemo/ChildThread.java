package threadsdemo;

public class ChildThread extends Thread{

	public ChildThread(String name) {
		// TODO Auto-generated constructor stub
		setName(name);
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		//super.run();
		for (int j = 1; j<=7; j++) {
			System.out.println(getName()+ " : " + j);
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	
	
	
	
	
}
