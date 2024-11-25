package oop;

class Worker{
	
	static String company = "Tata";
	
	static void show() {
		System.out.println("Hello from static method of another class");
	}
	
}

public class StaticMembers {
	
	static int count = 101;
	
	static void display() {
		System.out.println("Hello from static method");
	}

	public static void main(String[] args) {
		
		System.out.println(count);
		
		display();
		
		System.out.println(Worker.company);
		
		Worker.show();

	}

}
