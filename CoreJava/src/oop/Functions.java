package oop;

class Student{
	
	int roll_no;
	String name;
	float marks;
	
	void setInfo(int r, String n, float m) {
		roll_no = r;
		name = n;
		marks = m;
	}
	
	void getInfo() {
		System.out.println("Roll No : " + roll_no);
		System.out.println("Name : " + name);
		System.out.println("Marks : " + marks);
	}
	
	int getRollNo() {
		return roll_no;
	}
	
	String getName() {
		return name;
	}
	
	float getMarks() {
		return marks;
	}
	
}


public class Functions {

	public static void main(String[] args) {
		
		Student s1 = new Student();
		
		s1.setInfo(101, "Harry", 24);
		
		s1.getInfo();
		
		int rollNo = s1.getRollNo();
		String name = s1.getName();
		float marks = s1.getMarks();
		
		System.out.println(rollNo);
		System.out.println(name);
		System.out.println(marks);
	}

}














