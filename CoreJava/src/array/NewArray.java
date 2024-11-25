package array;

public class NewArray {

	public static void main(String[] args) {
		
		
		int[] array1 = new int[10];
		
		array1[0] = 10;
		array1[1] = 20;
		array1[2] = 30;
		array1[3] = 40;
		array1[4] = 50;
		array1[5] = 60;
		array1[6] = 70;
		array1[7] = 80;
		array1[8] = 90;
		array1[9] = 100;
		
		
		float array2[] = new float[5];
		
		array2[0] = 34.5f;
		array2[1] = 45.5f;
		array2[2] = 367.5f;
		
		array2[0] = 55.6f;
		
		
		char array3[] = {'a', 'b', 'c', 'd', 'e'};

		
//		System.out.println(array1[0]);
//		System.out.println(array1[1]);
//		System.out.println(array1[2]);
		
		
		int size = array1.length;
		
		for(int i = 0; i <= size-1; i++) {
			System.out.println(array1[i]);
		}
		
		
		for(char c : array3) {
			System.out.println(c);
		}
		
	}

}
