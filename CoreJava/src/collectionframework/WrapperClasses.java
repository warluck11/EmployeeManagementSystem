package collectionframework;

public class WrapperClasses {

	public static void main(String[] args) {
		
		//primative datatype
		int i = 10;

		//boxing - expicitly 
		Integer newInt = Integer.valueOf(i);
		
		//Auto Boxing - implicite
		Integer autoInt = i;
		
		
		//////////////////////////
		
		//unboxing - expicitly
		int a = newInt.intValue();
		
		//Auto unboxing - implicite
		int b = autoInt;
	}

}
