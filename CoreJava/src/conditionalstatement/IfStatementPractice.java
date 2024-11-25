package conditionalstatement;
import java.util.Scanner;

public class IfStatementPractice {

	/*
	 
	  Q1. Take a input from user for a number and check if entered number is zero, 
	  	negative or positive. 
	  	
	  		if(n == 0) {
				System.out.println("Zero");
			}else if(n < 0) {		
				System.out.println("Negative");
			}else {
				System.out.println("Positive");
			}
		  
	  Q2. Take a input from user for a number and check if that number is Even or Odd
	  
	  			if(n % 2 == 0) {
					System.out.println("Even");
				}else {
					System.out.println("Odd");
				}
	  
	  Q3. Take a input for three numbers and print the greatest of those three numbers
	  
	  
	  		if(n1 > n2 && n1 > n3) {
				System.out.println("Greatest Number : " + n1);
			}else if(n2 > n1 && n2 > n3) {
				System.out.println("Greatest Number : " + n2);
			}else {
				System.out.println("Greatest Number : " + n3);
			}
	

	  Q4. Take a input from user for 3 angles in triangle and check if that triangle is valid 
	  		or not
	  
	 */
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the First Angle : ");
		
		int n1 = sc.nextInt();
		
		System.out.print("Enter the Second Angle : ");
		
		int n2 = sc.nextInt();
		
		System.out.print("Enter the Third Angle : ");
		
		int n3 = sc.nextInt();
		
		int sum = n1 + n2 + n3;
		
		if(sum == 180) {
			System.out.println("Valid");
		}else {
			System.out.println("InValid");
		}
		
	}

}
