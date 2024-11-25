package oop;

class Person{
	
	//Properties
	String name;
	String email;
	long mobile;
	
	//Behavoiur
	void getInfo() {
		System.out.println("Name : " + name);
		System.out.println("Email : " + email);
		System.out.println("Mobile : " + mobile);
	}
}


public class ClassAndObject {

	public static void main(String[] args) {
		
		Person p1 = new Person();
		
		p1.name = "Harry";
		p1.email = "harry@gmail.com";
		p1.mobile = 7892738243l;
		
		p1.getInfo();
		
		System.out.println();
		
		Person p2 = new Person();
		
		p2.name = "Ron";
		p2.email = "ron@gmail.com";
		p2.mobile = 4645365345l;
		
		p2.getInfo();
		

	}

}
