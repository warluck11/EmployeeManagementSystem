package looping;
import java.util.Scanner;

public class LoopsPractice {

		/*
		 
		  Q1. Print the numbers from 10 to 1
		  			
		  		
				for(int i = 10; i >= 1; i--) {
					System.out.println(i);
				}	
		  
		  Q2. Print the sum of first 10 natural numbers 
		  
		  			int sum = 0;
		
					for(int i = 1; i <= 10; i++) {
						sum += i;  //sum = sum + i;
					}
					
					
					System.out.println("Sum is " + sum);

		  
		  Q3. Print the even numbers between 1 to 25
		  
		  			for(int i = 1; i <= 25; i++) {
			
						if(i % 2 == 0) {
							System.out.println(i);
						}
						
					}
		  	
		  
		  Q4. Print the table of given number as below format
		  
		  		5 X 1 = 5 
		  		
		  		
				for(int i = 1; i <= 10; i++) {
					System.out.println(n + " X " + i + " = " + (i*n));
				}
		  		
		  Q5. Find the factorial of given number 
		  
		 */
	
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the Number : ");
		
		int n = sc.nextInt();
		
		int fact = 1;
		
		
		for(int i = 1; i <= n; i++) {
			fact *= i;
		}
		
		System.out.println("Factotial is " + fact);
		
	
		
		
	}

}












