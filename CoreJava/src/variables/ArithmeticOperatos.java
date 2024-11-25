package variables;

public class ArithmeticOperatos {

	public static void main(String[] args) {
		
		//use arithmetic operators on int and float 
		
		
		// jvm will convert int into float and the  perform the operation  
		int a = 10;
		float b = 23.5f;
		
		System.out.println("Additio is " + (a+b));
		
		
		//use arithmetic operators on chars 
		
		//char will be converted into ASCII value and it will return int 
		char c1 = 'a';
		char c2 = 'b';
		
		System.out.println("Addition of chars is " + (c1+c2));
		
		
		//use arithmetic operators on boolean 
		
		
		boolean b1 = true;
		
		//We can use arithmetic operats on boolean 
		//System.out.println("Addition of boolean is " + (b + b1)); Invalid 

	}

}
