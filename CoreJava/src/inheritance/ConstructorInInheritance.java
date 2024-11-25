package inheritance;

class Animal{
	
	String name;
	String sound;
	
	Animal(String name, String sound){
		this.name = name;
		this.sound = sound;
	} 
	
	void getInfo() {
		System.out.println("Name : " + name);
		System.out.println("Sound : " + sound);
	}

}

class Dog extends Animal{
	
	Dog(String name, String sound){
		super(name, sound);
	}
}


public class ConstructorInInheritance {

	public static void main(String[] args) {
		
		Dog d1 = new Dog("Tommy", "Bark");
	
		d1.getInfo();
	}

}
