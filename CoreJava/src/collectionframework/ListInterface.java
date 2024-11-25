package collectionframework;
import java.util.ArrayList;
import java.util.List;

public class ListInterface {
	
	public static void main(String[] args) {
		
		List list = new ArrayList();
		
		list.add(2); // Auto Boxing 
		list.add("Aditya");
		list.add(true);
		list.add(2);
		
		System.out.println(list);
		
		System.out.println(list.get(2));
		
		
		for(Object o : list) {
			System.out.println(o);
		}
		
	}

}