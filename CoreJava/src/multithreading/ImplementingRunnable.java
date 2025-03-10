package multithreading;


class NumberPrint implements Runnable{
	
	@Override
	public void run() {
		
		for(int i = 1; i <= 50; i++) {
			System.out.println(Thread.currentThread().getName() + " " + i);
		}
		
	}
	
}

public class ImplementingRunnable {
	
	public static void main(String[] args) {
		
		NumberPrint p1 = new NumberPrint();
		
		Thread t1 = new Thread(p1, "T1");
		Thread t2 = new Thread(p1, "T2");
		
		t1.start();
		t2.start();
		
		
	}

}
