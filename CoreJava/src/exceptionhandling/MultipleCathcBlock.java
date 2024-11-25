package exceptionhandling;

public class MultipleCathcBlock {
	
	public static void main(String[] args) {
		
		int a = 10;
		int b = 2;
		
		try {
			int z = a/b;
			System.out.println(z);
			
			String s = null;
			
			System.out.println(s.toLowerCase());
			
		}catch (ArithmeticException e) {
			System.out.println(e.getMessage());
		}catch(NullPointerException e) {
			System.out.println(e.getMessage());
		}
		
		
	}

}
