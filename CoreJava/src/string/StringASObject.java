package string;

class Student{
	
	int roll_no;
	String name;
	float marks;
	
	Student(int roll_no, String name, float marks){
		this.roll_no = roll_no;
		this.name = name;
		this.marks = marks;
	}

	@Override
	public String toString() {
		return "Student [roll_no=" + roll_no + ", name=" + name + ", marks=" + marks + "]";
	}
	
	
	
}


public class StringASObject {
	
	public static void main(String[] args) {
		
		Student s1 = new Student(101, "Harry", 22);
		
		System.out.println(s1);
		
	}

}
