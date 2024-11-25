package exceptionhandling;

public class ThorwKeyowrd {
	
	public static void main(String[] args) {
		
		int a = 10;
		int b = -2;
		
		try {
			
			if(b < 0) {
				throw new ArithmeticException("Number must be positive");
			}
			
			int z = a/b;
			
			System.out.println(z);
			
		}catch(ArithmeticException e) {
			System.out.println(e.getMessage());
		}
		
	}

}
