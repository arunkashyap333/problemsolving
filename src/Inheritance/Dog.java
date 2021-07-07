package Inheritance;

public class Dog extends Animal{

	@Override
	public void speaks() {
		System.out.println("Dog barks");
	}
	
	public static void main(String[] args) {
		Dog dog = new Dog();
		dog.getLegCount();
		dog.speaks();
	}
	
}
