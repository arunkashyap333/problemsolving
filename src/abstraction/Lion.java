package abstraction;

public class Lion extends Animal{

	@Override
	public void speaks() {
		System.out.println("Lion roars");
	}
	
	public void eats() {
		System.out.println("Lion is eating");
	}

}
