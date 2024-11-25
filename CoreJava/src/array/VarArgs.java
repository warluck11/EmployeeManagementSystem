package array;

public class VarArgs {

 	static int sum_array(int[] arr) {
		
		int sum = 0;
		
		for(int x : arr) {
			sum += x;
		}
		
		
		return sum;
	}
 	
 	
 	static int sum_varargs(int... values) {
 		
 		int sum = 0;
 		
 		for(int x : values) {
 			sum += x;
 		}
 		
 		return sum;
 	}
	
	public static void main(String[] args) {
		
		int[] arr1 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10}; 
		
		int result = sum_array(arr1);
		
		System.out.println("Sum : " + result);
		
		int sum = sum_varargs(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

		System.out.println("Sum : " + sum);
		
	}

}
