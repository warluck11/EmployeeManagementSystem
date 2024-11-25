package string;

public class StringInmutable {
	
	public static void main(String[] args) {
		
		String s1 = "Hello";
		
		System.out.println(s1 + " " + s1.hashCode());
		
		s1 = s1 + " World";
		
		System.out.println(s1+ " " + s1.hashCode());
		
		String s2 = "Hello";
		
		System.out.println(s2 + " " + s2.hashCode());
		
		
		//StringBuffer
		
		StringBuffer s3 = new StringBuffer("Good");
		
		System.out.println(s3 + " " + s3.hashCode());
		
		s3.append(" Morning");
		
		System.out.println(s3 + " " + s3.hashCode());
		
		
		//StringBulider 
		
		StringBuilder s4 = new StringBuilder("Aditya");
		
		System.out.println(s4 + " " + s4.hashCode());
		
		s4.append(" Kale");
		
		System.out.println(s4 + " " + s4.hashCode());
		
		
		
	}

}
