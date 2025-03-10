package oop;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class StreamAPI {
	
	public static void main(String[] args) {
		
		List<String> subjects = new ArrayList<String>();
		
		subjects.add("Maths");
		subjects.add("english");
		subjects.add("History");
		subjects.add("Hindi");
		subjects.add("geomerty");
		
		Stream<String> s1 = subjects.stream();
		
		//s1.forEach(n -> System.out.println(n));
		
		//s1.sorted().forEach(n -> System.out.println(n));
		
		//s1.filter(n -> n.contains("e")).sorted().forEach(n -> System.out.println(n));
		
		Stream<String> s2 = subjects.parallelStream();
		
		s2.forEach(n -> System.out.println(n));
		
	}

}
