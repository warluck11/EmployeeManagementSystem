package faulty;

import student.ProtectedModifier;
import student.PublicModifier;





public class NewDemo extends ProtectedModifier{

	public static void main(String[] args) {
		
		PublicModifier p1 = new PublicModifier();
		
		p1.count = 22;
		p1.show();
		
		NewDemo p2 = new NewDemo();
		
		p2.view = 22;
		p2.display();
		

	}

}
