package multithreading;

class MainThreadImpl implements Runnable{
	
	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName() + " Started");
		System.out.println(Thread.currentThread().getName() + " Ended");
	}
	
}

class DemonThreadImpl implements Runnable{
	
	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName() + " Started");
		System.out.println(Thread.currentThread().getName() + " End");
	}
	
}


public class DemonThread {
	
	public static void main(String[] args) {
		
		Thread mainThread = new Thread(new MainThreadImpl(), "Main");
		
		Thread demonThread = new Thread(new DemonThreadImpl(), "Demon");
		
		demonThread.setDaemon(true);
		
		System.out.println("Hello");
		
		//mainThread.start();
		demonThread.start();
		
	}

}
