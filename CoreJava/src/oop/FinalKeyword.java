package oop;

final class Laptop{
	
	final int PRICE = 2000;
	
	final int COUNT;
	
	Laptop(int COUNT){
		this.COUNT = COUNT;
	}
	
	final void display() {
		System.out.println("Hello from final Method");
	}
	
}




public class FinalKeyword {

	public static void main(String[] args) {
		
		
		Laptop l1 = new Laptop(23);
		
		
		System.out.println(l1.PRICE);
		System.out.println(l1.COUNT);
		
		l1.display();
		
	}

}
