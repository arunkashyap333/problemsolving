package interfacedemo;

public class Cat extends Animal implements Pet{

	private String name;
	
	protected Cat() {
		this("");
	}
	
	protected Cat(String name) {
		super(4);
	}
	

	@Override
	public String getName() {
		return name;
	}

	@Override
	public void setName(String name) {
		this.name = name;
	}

	@Override
	public void play() {
		System.out.println("Cat Jumps");
	}

	@Override
	void eat() {
		System.out.println("Cat eats rats");
	}

}
