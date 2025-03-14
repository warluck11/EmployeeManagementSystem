package multithreading;

class Sender{
	
	public void sendMessage(String message) {
		
		System.out.println(message + " sending");
		
		try {
			Thread.sleep(1000);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		System.out.println("Message Received");
	}
	
}

class sendUsingThread extends Thread{
	
	Sender s;
	String message;
	
	public sendUsingThread(Sender s, String message) {
		this.s = s;
		this.message = message;
	}

	
	@Override
	public void run() {
		synchronized (s) {
			s.sendMessage(message);
		}
	}
	
}


public class Synchronizedblock {

	public static void main(String[] args) {
		
		Sender s = new Sender();
		
		sendUsingThread t1 = new sendUsingThread(s, "Hello");
		sendUsingThread t2 = new sendUsingThread(s, "Good Evening");
		
		t1.start();
		t2.start();
		
	}
	
}
