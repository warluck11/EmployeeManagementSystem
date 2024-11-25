package exceptionhandling;

public class ExceptionHandling {
	
	public static void main(String[] args) {
		
		int x = 10;
		int y = 0;
		
		System.out.println("Before performing operation");
		
		try {
			int z = x / y;
			
			System.out.println("Division is " + z);
			
		}catch(Exception e) {
			System.out.println("You can not divide by zero");
			e.printStackTrace();
		}
		
		System.out.println("After performing operation");
		
		
	}

}
