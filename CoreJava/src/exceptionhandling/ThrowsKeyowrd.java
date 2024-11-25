package exceptionhandling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ThrowsKeyowrd {
	
	public void OpenFile(String fileName) throws FileNotFoundException{
		FileInputStream fs = new FileInputStream("result.txt");
	}
	

	public static void main(String[] args) {
		
		
	}
	
}
