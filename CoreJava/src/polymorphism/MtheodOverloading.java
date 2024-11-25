package polymorphism;

class Calulator{
	
	void add(int x , int y) {
		
		int sum = x + y;
		
		System.out.println("The sum of 2 Int is " + sum);
	}
	
	void add(int x, int y, int z){
		
		int sum = x + y + z;
		
		System.out.println("The sum of 3 Int is " + sum);
	}
	
	void add(int x, float y){
		
		float sum = x + y;
		
		System.out.println("The sum of one Int and Float is " + sum);
	}
	
	void add(float x, int y){
		float sum = x + y;
		
		System.out.println("The sum of one Float and Int is " + sum);
	}
	
	
}

public class MtheodOverloading {

	public static void main(String[] args) {
		
		Calulator c = new Calulator();
		
		c.add(2, 3);
		c.add(1, 2, 3);
		c.add(1, 1.2f);
		c.add(3.2f, 2);

	}

}
