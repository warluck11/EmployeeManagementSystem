package multithreading;

class PrintNumber extends Thread{
	
	@Override
	public void run() {
		
		for(int i = 1; i <= 50; i++) {
			System.out.println(Thread.currentThread().getName() + " " + i);
		}
		
	}
	
}

public class ThreadExtends {
	
	public static void main(String[] args) {
		
		PrintNumber p1 = new PrintNumber();
		PrintNumber p2 = new PrintNumber();
		
		p1.setName("Thread 1");
		p2.setName("Thread 2");
		
		p1.start();
		p2.start();
	}

}
