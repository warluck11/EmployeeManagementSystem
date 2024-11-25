package oop;

class Employee{
	
	int id;
	String name;
	float salary;
	String department;
	
	Employee(int id, String name, float salary, String department){
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.department = department;
	}
	
	void getInfo() {
		System.out.println("Id : " + id);
		System.out.println("Name : " + name);
		System.out.println("Salary : " + salary);
		System.out.println("Department : " + department);
	}
	
}


public class ConstructorMethod {

	public static void main(String[] args) {
		
		Employee e1 = new Employee(101, "Harry", 10000, "IT");
		
		e1.getInfo();
		
	
		

	}

}












