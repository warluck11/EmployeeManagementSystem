package inheritance;

class Parent1{
	
	String name;
	long mobile;
	int age;
	
	void getInfo() {
		System.out.println("Name : " + name);
		System.out.println("Mobile : " + mobile);
		System.out.println("Age : " + age);
	}
	
}

class Child1 extends Parent1{
	
}

public class SingleLevelInheritance {

	public static void main(String[] args) {
		
		Child1 c1 = new Child1();
		
		c1.name = "Harry";
		c1.mobile = 78867867687l;
		c1.age = 22;
		
		c1.getInfo();
		
	}

}
