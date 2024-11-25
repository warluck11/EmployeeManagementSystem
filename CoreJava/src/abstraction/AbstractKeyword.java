package abstraction;

abstract class CommonFunctionality{
	
	void createLogin() {
		System.out.println("Loggin Created!!!");
	}
	
	void login() {
		System.out.println("User has Logged In!!!");
	}
	
	abstract void viewContent();
	
}


class FreeUser extends CommonFunctionality{
	
	@Override
	void viewContent() {
		System.out.println("Free Content");
	}
	
	
}

class PaidUser extends CommonFunctionality{
	
	@Override
	void viewContent() {
		System.out.println("Paid Content");
	}
}

public class AbstractKeyword {

	public static void main(String[] args) {
	
		FreeUser f1 = new FreeUser();
		
		f1.createLogin();
		f1.login();
		f1.viewContent();
		
		System.out.println();
		
		PaidUser p1 = new PaidUser();
		
		p1.createLogin();
		p1.login();
		p1.viewContent();
			

	}

}
