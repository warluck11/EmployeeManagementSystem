package collectionframework;

import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class MpaInterface {
	
	public static void main(String[] args) {
		
		//Map<String, Integer> marks = new HashMap<String, Integer>();
		
		//Map<String, Integer> marks = new LinkedHashMap<String, Integer>();
		
		Map<String, Integer> marks = new TreeMap<String, Integer>();
		
		marks.put("English", 33);
		marks.put("Hindi", 55);
		
		System.out.println(marks);
		
		marks.put("Science", 66);
		marks.put("Maths", 77);
		marks.put("History", 64);
		
		System.out.println(marks);
		
		
		Set<String> keys = marks.keySet();
		
		System.out.println(keys);
		
		Collection<Integer> values = marks.values();
		
		System.out.println(values);
		
	}

}
