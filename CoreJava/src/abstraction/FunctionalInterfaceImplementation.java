package abstraction;

@FunctionalInterface
interface Message{
	
	void sendMessage();
	
}

class FunInt implements Message{
	
	@Override
	public void sendMessage() {
		System.out.println("Message Send");
	}
	
}


public class FunctionalInterfaceImplementation {

	public static void main(String[] args) {
		
		FunInt f1 = new FunInt();
		
		f1.sendMessage();

	}

}
