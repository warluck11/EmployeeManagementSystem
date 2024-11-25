package collectionframework;

import java.util.HashSet;
import java.util.Set;

public class SetInterface {
	
	public static void main(String[] args) {
		
		Set set = new HashSet();
		
		set.add(2);
		set.add("Aditya");
		set.add("Kale");
		set.add(23);
		set.add(44);
		set.add(true);
		set.add(44);
		
		System.out.println(set);
		
	}

}
