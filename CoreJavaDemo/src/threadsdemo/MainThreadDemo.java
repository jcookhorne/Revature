package threadsdemo;

public class MainThreadDemo {
	
	
	public static void main(String[] args) {
		
		//class called thread in java.lang
		//thread.currentThread it is a method that is called
		// it is a static method because it can be called without the new 
		Thread mainThread = Thread.currentThread();
		mainThread.setName("MyMainThread");
		
		
		System.out.println("Thread name : " +  mainThread.getName());
		System.out.println("Priority: " + mainThread.getPriority());
		System.out.println("State of Thread: " + mainThread.getState());
		System.out.println("Thread group : " + mainThread.getThreadGroup());
		System.out.println("is the thread alive: " + mainThread.isAlive() );
		
		ChildThread ct1 = new ChildThread("MyChildThreadOne");
	    ChildThread ct2 = new ChildThread("MyChildThreadtwo");
		ThreadMyDemo tmd = new ThreadMyDemo("My timer");
		SecondChildThread sct1 = new SecondChildThread("MychildThread3");
		//this is when we tell the operating system that a 
		// child thread is being created
		//only when we call the start method the child thread
		//will spawn from the parent thread
		// this method will also implicitly(on it own) call the run method
		ct1.start();
		ct2.start();
		ThreadMyDemo tmd2 = new ThreadMyDemo("My timer 2");
		
		
		
		for(int i = 1; i<= 5; i++) {
			System.out.println(mainThread.getName()+ " : "+i);
			
			try {
				// telling a thread to go to sleep makes it delay by a certain amount of milliseconds
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	
}
