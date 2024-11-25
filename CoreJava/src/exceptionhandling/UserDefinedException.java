package exceptionhandling;

class AgeException extends Exception{
	
	public AgeException() {
		super("Age must be greater than 18");
	}
}

class Employee{
	
	int id;
	String name;
	int age;
	
	public Employee(int id, String name, int age) throws AgeException {
		
		this.id = id;
		this.name = name;
		
		if(age >= 18) {
			this.age = age;
		}else {
			throw new AgeException();
		}	
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", age=" + age + "]";
	}
	
	
	
}


public class UserDefinedException {
	
	public static void main(String[] args) {
		
		Employee e1 = null;
		
		try {
			
			e1 = new Employee(101, "Harry", 12);
			
			System.out.println(e1);
			
		}catch(AgeException e) {
			System.out.println(e.getMessage());
		}
		
		
	}

}
