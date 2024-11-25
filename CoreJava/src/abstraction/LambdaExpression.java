package abstraction;

@FunctionalInterface
interface Perimeter{
	void calulate();
}

@FunctionalInterface
interface Message2{
	void sendMessage(String message);
}

@FunctionalInterface
interface Calulate{
	void add(int x, int y);
}

public class LambdaExpression {

	public static void main(String[] args) {
		
		Perimeter p1 = () -> {System.out.println("Hello from Perimeter Method");};
		
		p1.calulate();

		
		Message2 m1 = message -> { 
			
			System.out.println("Message : " + message);
		};
		
		m1.sendMessage("Good Morning");
		
		Calulate c1 = (x, y) -> {
			
			int sum = x + y;
			
			System.out.println("Addition is " + sum);
			
		};
		
		c1.add(2, 3 );
		
		
	}

}
