package array;

public class PracticeArray {

	/*
	 
	  Q1. Find the index of given element form array
	  
	   		int[] arr = {10, 20, 30, 40, 50};
	   		
	   		int element = 50;
   		
	   		for(int i = 0; i < arr.length; i++) {
	   			
	   			if(arr[i] == element) {
	   				System.out.println("Index of Element is " + i);
	   			}
	   			
	   		}
		
	   		
	   
	  Q2. Find the Largest number from array  	
	  
	  
	  		int[] arr = {23, 13, 12, 321, 435, 12, 4 };
   		
	   		int max = 0;
	   		
	   		
	   		for(int i = 0; i < arr.length; i++) {
	   		
	   			if(max < arr[i] ) {
	   				max = arr[i];
	   			}
	   			
	   		}
	    		
	   		System.out.println("Maximun number is " + max);
	  
   		


	  
	  
	  Q3. Find the second largest Number from array	
	  
	  	
	  Q4. Sort the array in acending order	
	  	
	 */
	
	
	
	public static void main(String[] args) {
		
		int[] arr = {23, 13, 12, 321, 435, 12, 4 };
		
		int temp = 0;
		
		for(int i = 0; i < arr.length-1; i++) {
			
			for(int j = i+1; j < arr.length; j++) {
				
				if(arr[i] > arr[j]) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;		
				}
				
			}
			
		}

		
		for(int  i : arr) {
			System.out.println(i);
		}
	}
}
