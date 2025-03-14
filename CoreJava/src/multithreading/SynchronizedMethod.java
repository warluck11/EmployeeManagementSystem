package multithreading;

class Table{
	
	synchronized void printTable(int n){
		for(int i = 1; i <= 10; i++) {
			System.out.println(n + " X " + i + " = " + (n*i));
			
			try {
				Thread.sleep(1000);
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
			
		}
	}
}

class Thread1 extends Thread{
	
	Table t;
	
	public Thread1(Table t) {
		this.t = t;
	}
	
	@Override
	public void run() {
		t.printTable(5);
	}
	
}

class Thraed2 extends Thread{
	
	Table t;
	
	public Thraed2(Table t) {
		this.t = t;
	}
	
	@Override
	public void run() {
		t.printTable(2);
	}
	
}


public class SynchronizedMethod {
	
	public static void main(String[] args) {
		
		Table t = new Table();
		
		Thread1 t1 = new Thread1(t);
		Thraed2 t2 = new Thraed2(t);
		
		t1.start();
		t2.start();
		
	}

}
