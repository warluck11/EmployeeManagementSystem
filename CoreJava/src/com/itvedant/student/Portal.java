package com.itvedant.student;

class Student{
	
	private int roll_no;
	private String name;
	private String email;
	private float marks;
	
	public int getRoll_no() {
		return roll_no;
	}
	public void setRoll_no(int roll_no) {
		this.roll_no = roll_no;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public float getMarks() {
		return marks;
	}
	public void setMarks(float marks) {
		this.marks = marks;
	}
	

	
	
}


public class Portal {

	public static void main(String[] args) {
		
		Student s1 = new Student();
	
		s1.setRoll_no(101);
		s1.setName("Harry");
		s1.setEmail("harry@gmail.com");
		s1.setMarks(22);
		
		int roll_no = s1.getRoll_no();
		String name = s1.getName();
		String email = s1.getEmail();
		float marks = s1.getMarks();
		
		System.out.println("Roll No : " + roll_no);
		System.out.println("Name : " + name);
		System.out.println("Email : " + email);
		System.out.println("Marks : " + marks);
		
	}

}
