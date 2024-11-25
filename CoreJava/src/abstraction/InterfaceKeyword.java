package abstraction;


interface Test{
	
	void startTest();
	
	void endTest();
	
}

interface Assignement{
	
	String subject = "English";
	
	void getScore();
	
}


class Student implements Test, Assignement{
	
	@Override
	public void startTest() {
		System.out.println("Test has been started");
	}
	
	@Override
	public void endTest() {
		System.out.println("Test Ended");
	}
	
	@Override
	public void getScore() {
		System.out.println("Check score on the mail");
	}
	
}

public class InterfaceKeyword {
	
	public static void main(String[] args) {
		
		Student s1 = new Student();
		
		System.out.println("Subject : " + Assignement.subject);
		
		s1.startTest();
		s1.endTest();
		s1.getScore();
		
		Test t = new Student();
		
		t.startTest();
		t.endTest();
		
		Assignement a = new Student();
		
		a.getScore();
		
		
	}

}
