package conditionalstatement;
import java.util.Scanner;

public class PrimeNumber {

	/*
	 
	  Q1. Check if given number is Prime or not.
	  
	  				
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the Number : ");
		
		int n = sc.nextInt();
		
		boolean flag = true; 
		
		for(int i = 2; i < n; i++) {
			
			if(n % i == 0) {
				flag = false;
			}
			
		}
		
		if (flag){
			System.out.println("Prime Number");
		}else {
			System.out.println("Not a Prime Number");
		}
		
	
	  
	  
	  Q2. Print all the prime numbers between 1 to 50
	  
	  
	  			int count = 0;
		
				for(int i = 1; i <= 25; i++) {
					
					count = 0;
					
					for(int j = 1; j <= i; j++) {
						
						if(i % j == 0) {
							count++;
						}
						
					}
					
					if(count == 2) {
						System.out.println(i);
					}
				}
				
		Q3. Swap two numbers  
		
				a = 10;
				b = 20;
				
				
				a = 20;
				b = 10;
				
				
				
				int a = 10;
				int b = 20;
				
				int temp;
				
				temp = a;
				a = b;
				b = temp;
				
				System.out.println("The value of a is " + a);
				System.out.println("The value of b is " + b);
				
				
		Q4. Print the first 10 numbers of Fibonachii series 
				
					int n1 = 0;
					int n2 = 1;
					int nextTerm;
					
					System.out.println(n1);
					System.out.println(n2);
					
					for(int i = 1; i <= 10; i++) {
						nextTerm = n1 + n2;
						System.out.println(nextTerm);
						
						n1 = n2;
						n2 = nextTerm;
					}
					
					
					
					
		Q5. Check if the given number is Armstrong Number or Not 
		
			Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the Number : ");
		
		int num = sc.nextInt();

		int temp = num;		
		int reminder;
		int sum = 0;
		
		while(temp != 0) {
		   reminder =  temp % 10;
		   sum = sum + reminder * reminder * reminder;
		   temp = (int)  temp / 10;
		}
		
		if(sum == num ) {
			System.out.println("Armstrong Number");
		}else {
			System.out.println("Not a Armstrong Number");
		}
		
				
	  
	 */
	
	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the Number : ");
		
		int num = sc.nextInt();
		
		int temp = num;
		
		int count = 0;
		
		while(temp != 0) {
			temp = (int) temp/10;
			count++;
		}
		
		
		System.out.println("Number of Digits : " + count);
	}

}









