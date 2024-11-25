package polymorphism;

class Animal{
	
	void Sound() {
		System.out.println("Sound of Any Animal");
	}
	
}

class Dog extends Animal{
	
	@Override
	void Sound() {
		System.out.println("Bark");
	}
	
}

class Cat extends Animal{
	
	@Override
	void Sound() {
		System.out.println("Meow");
	}
	
}

class Tiger extends Animal{
	
	@Override
	void Sound() {
		System.out.println("Roar");
	}
	
}


public class MethodOveriding {

	public static void main(String[] args) {
		
		Animal a = new Animal();
		Dog d = new Dog();
		Cat c = new Cat();
		Tiger t = new Tiger();
		
		a.Sound();
		d.Sound();
		c.Sound();
		t.Sound();
	}

}
