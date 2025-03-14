package collectionframework;


import java.util.ArrayList;
import java.util.List;

public class GenericCollection {
	
	public static void main(String[] args) {
		
		//Non-Generic Collection
		List list = new ArrayList();
		
		list.add("Aditya");
		list.add("Vishal");
		list.add("Sagar");
		list.add("Tejas");
		list.add(24);
		list.add(45);

		//Generic Collection 
		List<String> stringList = new ArrayList<String>();
		
		stringList.add("Aditya");
		stringList.add("Vishal");
		stringList.add("Sagar");
		stringList.add("Tejas");
		
		for(String o : stringList) {
			System.out.println( o.toUpperCase() );
		}
	}

}
