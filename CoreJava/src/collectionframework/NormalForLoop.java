package collectionframework;

import java.util.ArrayList;
import java.util.List;

public class NormalForLoop {
	
	public static void main(String[] args) {
		
		List<Integer> list = new ArrayList<Integer>();
		
		list.add(23);
		list.add(22);
		list.add(66);
		list.add(34);
		
		System.out.println(list);
		
		
		for(int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		
		
		for(Integer i : list) {
			System.out.println(i);
		}
		
	}

}
