package inheritance;


class Person{
	
	String name;
	int age;
	
	void getInfo() {
		System.out.println("Name : " + name);
		System.out.println("Age : " + age);
	}
	
}

class Student extends Person{
	
}

class Faluty extends Person{
	
}

public class HierarchicalInheritance {

	public static void main(String[] args) {
		
		Student s1 = new Student();
		
		s1.name = "Harry";
		s1.age = 33;
		
		s1.getInfo();
		
		Faluty f1 = new Faluty();
		
		f1.name = "Ron";
		f1.age = 44;
		
		f1.getInfo();

	}

}
