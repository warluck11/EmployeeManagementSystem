package exceptionhandling;

import java.io.FileInputStream;

public class CheckedExceeption {
	
	 	public static void main(String[] args) {
			
	 		try {
	 		
	 		FileInputStream fs = new FileInputStream("result.txt");
	 		
	 		}catch(Exception e) {
	 			System.out.println(e);
	 		}
		}

}
