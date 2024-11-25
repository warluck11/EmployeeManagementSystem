package abstraction;

interface Status{
	
	//public abstract
	void show();
	
	//default
	default void defaultMethod() {
		System.out.println("Hello from default method");
		privateMethod();
		privateStaticMethod();
	}
	
	//static
	static void staticMethod() {
		System.out.println("Hello from static method");
	}
	
	//private 
	private void privateMethod() {
		System.out.println("Hello from Private Method");
	}
	
	//private static
	private static void privateStaticMethod() {
		System.out.println("Hello from private static method");
	}
	
}

class Insta implements Status{
	
	@Override
	public void show() {
		System.out.println("Hello from Public Abstarct Method");
	}
	
}

public class NewInterfaceMethod {

	public static void main(String[] args) {
		
		Insta i1 = new Insta();
		
		i1.show();
		i1.defaultMethod();
		
		Status.staticMethod();

	}

}
