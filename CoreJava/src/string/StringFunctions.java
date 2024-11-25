package string;

public class StringFunctions {

	public static void main(String[] args) {
		
		String s = "Good Morning";
		
		System.out.println(s.toLowerCase());
		System.out.println(s.toUpperCase());
		
		System.out.println(s.charAt(3));
		System.out.println(s.length());
		
		System.out.println(s.startsWith("w"));
		System.out.println(s.endsWith("G"));
		System.out.println(s.contains("o"));
		
		System.out.println(s.replace("o", "i"));
		System.out.println(s.substring(3));
		System.out.println(s.substring(3, 8));
		
		char[] c = s.toCharArray();
		
		for(char x : c) {
			System.out.println(x);
		}
		
		
		String s1 = "Java is most secure language";
		
		String[] arr = s1.split(" ");
		
		for(String x : arr) {
			System.out.println(x);
		}
		
		//Stringbuffer functions 
		
		StringBuffer s2 = new StringBuffer("Hello World");
		
		System.out.println(s2.append(" Good Morning"));
		
		System.out.println(s2.insert(0, "Hey "));
		
		System.out.println(s2.replace(0, 5, "Hiii "));
		
		System.out.println(s2.delete(0, 5));
		
		System.out.println(s2.reverse());
		
	}
	
}
