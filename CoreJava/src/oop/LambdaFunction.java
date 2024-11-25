package oop;

@FunctionalInterface
interface A{
	
	void methodA();
	
}

@FunctionalInterface
interface B{
	
	void methodB(String name);
	
}

@FunctionalInterface
interface C{
	
	void methodC(int x, int y);
	
}

public class LambdaFunction {

	public static void main(String[] args) {
		
		A a1 = () -> {System.out.println("Hello from Method A");};
		
		a1.methodA();
		
		B b1 = name -> {System.out.println("Name : " + name);};
		
		b1.methodB("Aditya");
		
		C c1 = (x, y) -> {
			
			System.out.println("Addition is " + (x+y));
			
		};
		
		c1.methodC(2, 3);
		
	}
	
}
