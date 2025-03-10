package collectionframework;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class ListLiteratorInterface {
	
	public static void main(String[] args) {
		
		List<String> names = new ArrayList<String>();
		
		names.add("Aditya");
		names.add("Vishal");
		names.add("Sagar");
		names.add("Tejas");
		
		ListIterator<String> iter = names.listIterator();
		
//		System.out.println(iter.hasNext());
//		System.out.println(iter.next());
//		
//		System.out.println(iter.hasPrevious());
//		System.out.println(iter.previous());
		
		
		while(iter.hasNext()) {
			System.out.println(iter.next());
		}
		
		while(iter.hasPrevious()) {
			System.out.println(iter.previous());
		}
		
		
	}

}
