package array;

public class MultidimentionalArray {

	public static void main(String[] args) {
		
		
		int[][] arr = { {23	,44	,55}, 
						{67	,56	,77}, 
						{45	,44 ,66}, 
						{56	,65 ,76} };
		
		
		System.out.println(arr.length);
		
		System.out.println(arr[0].length);
		
		//Normal For Loop 
		for(int i = 0; i < arr.length; i++) {
			
			for(int j = 0; j < arr[i].length; j++) {
				System.out.println("Element : " + arr[i][j]);
			}
			
		}
		
		
		//For Enchanced Loop 
		
		
		for(int[] x : arr) {
			for(int i : x) {
				System.out.println("Array :" + i);
			}
		}
		

	}

}
