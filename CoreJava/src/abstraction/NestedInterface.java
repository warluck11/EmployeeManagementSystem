package abstraction;

interface Outer{
	
	int c_out = 101;
	
	void outerMethod();
	
	
	
	interface Inner{
		
		int c_in = 201;
		
		void innerMethod();
		
	}
	
	
}


class Nested implements Outer, Outer.Inner{
	
	@Override
	public void outerMethod() {
		System.out.println("Hello from Outer Method");
	}
	
	@Override
	public void innerMethod() {
		System.out.println("Hello from Inner Method");
	}
	
}


public class NestedInterface {

	public static void main(String[] args) {
		
		Nested n1 = new Nested();
		
		n1.innerMethod();
		n1.outerMethod();
		

	}

}
