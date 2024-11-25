package variables;

public class TypeCasting {

	public static void main(String[] args) {
		
		
		// Implicit TypeCasting (Widening TypeCasting) .
		
		byte a = 10;
		
		int b = a;

		System.out.println("The value of a is " + a);
		System.out.println("The value of b is " + b);
		
		
		// Explicit TypeCasting (Narrowing TypeCasting)
		
		int x = 90;
		
		byte y = (byte) x;
		
		System.out.println("The value of x is " + x);
		System.out.println("The value of y is " + y);
		
	}

}
