package polymorphism;

class Student{
	
	int roll_no;
	String name;
	float marks;
	
	Student(){
		System.out.println("First Constructor");
	}
	
	Student(int roll_no){
		this.roll_no = roll_no;
		System.out.println("Roll No : " + roll_no);
	}
	
	
	Student(int roll_no, String name, float marks){
		this.roll_no = roll_no;
		this.name = name;
		this.marks = marks;
		
		System.out.println("Roll NO : " + roll_no);
		System.out.println("Name : " + name);
		System.out.println("Marks : " + marks);
	}
}

public class ConstructorOverloading {

	public static void main(String[] args) {
		

		Student s1 = new Student();
		
		Student s2 = new Student(12);
		
		Student s3 = new Student(101, "Aditya", 33);
		
	}

}
