package abstraction;

interface One{
	
	void oneMethod();
	
}


interface Two extends One{
	
	void twoMethod();
	
}

class Simple implements Two{
	
	@Override
	public void oneMethod() {
		System.out.println("Hello from One Method");
	}
	
	@Override
	public void twoMethod() {
		System.out.println("Hello from Two Method");
	}
	
}


public class ExtendedInterface {

	public static void main(String[] args) {
		
		Simple s1 = new Simple();
		
		s1.oneMethod();
		s1.twoMethod();
		
	}

}
