package oop;

class Calulator{
	
	int x;
	int y;
	
	public Calulator(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	@Override
	protected void finalize() throws Throwable {
		System.out.println("Object has been deleted");
	}
	
}

public class GarbageCollection {

	public static void main(String[] args) {
		
		Calulator c1 = new Calulator(2, 3);
		
		c1 =  new Calulator(1, 5);
		
		c1 = new Calulator(4,  5);
		
		System.out.println("X : "  + c1.x);
		System.out.println("Y : " + c1.y);
		
		System.gc();
		
	}

}
