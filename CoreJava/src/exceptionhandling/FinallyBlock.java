package exceptionhandling;

import java.io.FileInputStream;

public class FinallyBlock {
	
	public static void main(String[] args) {
		
		FileInputStream fs = null;
		
		try {
			fs = new FileInputStream("lecturenotes.txt");
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}finally {
			System.out.println("Finally Block");
		}
		
		
		
	}

}
