package collectionframework;

import java.util.LinkedList;

public class LinkedListClass {
	
	public static void main(String[] args) {
		
		LinkedList<String> subject = new LinkedList<String>();
		
		subject.add("English");
		subject.add("Hindi");
		subject.add("History");
		
		System.out.println(subject);
		
		subject.addFirst("Marathi");
		subject.addLast("Maths");
		
		System.out.println(subject);
		
		subject.removeFirst();
		subject.removeLast();
		
		System.out.println(subject);
		
		subject.remove(1);
		
		System.out.println(subject);
		
		
		
	}

}
