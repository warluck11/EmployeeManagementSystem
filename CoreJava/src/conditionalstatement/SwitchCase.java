package conditionalstatement;
import java.util.Scanner;

public class SwitchCase {

	/*
	 
	  Q. print day of week based on number 
	  
	 */
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the Number : ");
		int n = sc.nextInt();
		
		switch(n) {
		
		case 1 : System.out.println("Monday");
					break;
		
		case 2 : System.out.println("Tuseday");
					break;
					
		case 3 : System.out.println("Wednesday");
					break;
					
		default : System.out.println("Invalid Input");
		
		}

	}

}
