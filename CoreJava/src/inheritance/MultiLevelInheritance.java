package inheritance;

class GrandParent{
	
	int count;
	
	void dispaly() {
		System.out.println("Hello form GrandParent class");
	}
	
}

class Parent2 extends GrandParent{
	
	String name;
	
	void show() {
		System.out.println("Hello from Parent class");
	}
	
}

class Child2 extends Parent2{
	
}


public class MultiLevelInheritance {

	public static void main(String[] args) {
		
		Child2 c1 = new Child2();
		
		c1.count = 12;
		c1.name = "Aditya";
		
		c1.dispaly();
		c1.show();
		

	}

}
