package conditionalstatement;
import java.util.Scanner;

public class IfStatment {
	
	/*
	 
	  Q1. If marks are greater than or equal to 35 then print result as passed. 
	  
	  
	  		if(marks >= 35) {
				System.out.println("Passed");
			}
		
	  Q2. If marks are greater than or equal to 35 then print result as passed or else 
	   		print result as Failed. 
	   		
	   			if(marks >= 35) {
					System.out.println("Passed");
				}else {
					System.out.println("Failed");
				}
			  
		Q3. If marks are equal to or greater than 75 then result will be Passed With First Class 
			If marks are equal to or greater than 35 then result will be Passed or else 
			result will be Failed.
			
			
					if(marks >= 75) {
						System.out.println("Passed with First Class");
					}else if(marks >= 35){
						System.out.println("Passed");
					}else {
						System.out.println("Failed");
					}
					
		Q4. In Army selection process Candidate Height must be equal to or more than 160 cm 
				and age must be equal or more than 18 years

	  
	  
	 */

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the Height : ");
		
		int height = sc.nextInt();
		
		System.out.print("Enter the Age : ");
		
		int age = sc.nextInt();
		
		if(height >= 160) {
			
			if(age >= 18) {
				System.out.println("Selected");
			}else {
				System.out.println("Not Selected");
			}
			
		}else {
			System.out.println("Not Selected");
		}
		
		
		
	}

}
