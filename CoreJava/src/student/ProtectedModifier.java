package student;

class Assigmenet{
	
	protected int marks;
	
	protected void startAssignment() {
		System.out.println("Assignment Started");
	}
	
	
}

public class ProtectedModifier {
	
	protected int view;
	
	protected void display() {
		System.out.println("hello from Protected Method");
	}

	public static void main(String[] args) {
		

		Assigmenet a = new Assigmenet();
		
		a.marks =22;
		a.startAssignment();
	}

}
