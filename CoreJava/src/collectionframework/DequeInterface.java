package collectionframework;

import java.util.Deque;
import java.util.LinkedList;

public class DequeInterface {
	
	public static void main(String[] args) {
		
		Deque<Integer> deque = new LinkedList<Integer>();
		
		deque.add(12);
		deque.add(14);
		deque.add(33);
		deque.add(44);
		
		System.out.println(deque);
		
		deque.addFirst(2);
		
		System.out.println(deque);
		
		deque.addLast(32);
		
		System.out.println(deque);
		
		deque.removeFirst();
		
		System.out.println(deque);
		
		deque.removeLast();
		
		System.out.println(deque);
	}

}
