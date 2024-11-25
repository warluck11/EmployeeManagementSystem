package collectionframework;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Iteratorinterface {
	
	public static void main(String[] args) {
		
		List<Integer> list = new ArrayList<Integer>();
		
		list.add(12);
		list.add(34);
		list.add(45);
		
		
		
		Iterator<Integer> iter = list.iterator();
		
//		System.out.println(iter.hasNext());
//		System.out.println(iter.next());
//		
//		System.out.println(iter.hasNext());
//		System.out.println(iter.next());
//		
//		System.out.println(iter.hasNext());
//		System.out.println(iter.next());
//		
//		System.out.println(iter.hasNext());
		
		
		while(iter.hasNext()) {
			System.out.println(iter.next());
		}
		
		
	}

}
