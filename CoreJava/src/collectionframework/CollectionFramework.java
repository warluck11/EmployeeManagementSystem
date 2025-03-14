package collectionframework;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

class Student implements Comparable<Student>{
	
	int id;
	String name;
	int marks;
	
	
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getMarks() {
		return marks;
	}

	public void setMarks(int marks) {
		this.marks = marks;
	}

	public Student(int id, String name, int marks) {
		super();
		this.id = id;
		this.name = name;
		this.marks = marks;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", marks=" + marks + "]";
	}

	@Override
	public int compareTo(Student o) {
		//return this.name.compareTo(o.name);
		
		if(this.marks == o.marks) {
			return 0;
		}else if(this.marks > o.marks) {
			return 1;
		}else {
			return -1;
		}
		
	}

}

class sortByName implements Comparator<Student>{
	
	@Override
	public int compare(Student o1, Student o2) {
		return o1.getName().compareTo(o2.getName());
	}
	
}

class sortByMarks implements Comparator<Student>{
	
	@Override
	public int compare(Student o1, Student o2) {
		
		if(o1.getMarks() == o2.getMarks()) {
			return 0;
		}else if(o1.getMarks() > o2.getMarks()) {
			return 1;
		}else {
			return -1;
		}
		
	}
	
}


public class CollectionFramework {
	
	public static void main(String[] args) {
		
		Student s1 = new Student(101, "Harry", 56);
		Student s2 = new Student(102, "Ron", 89);
		Student s3 = new Student(103, "Jhon", 51);
		
		Map<Integer, Student> students = new HashMap<Integer, Student>();
		
		students.put(s1.id, s1);
		students.put(s2.id, s2);
		students.put(s3.id, s3);
		
		System.out.println(students);
		
		
	}

}









