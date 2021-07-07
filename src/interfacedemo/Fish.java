package interfacedemo;

public class Fish extends Animal implements Pet{

	private String name;
	protected Fish() {
		super(0);
	}

	@Override
	void eat() {
		System.out.println("Fish eats small insects");
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
		System.out.println("Fish loves to swim");
	}
	
	@Override
	void walk() {
		System.out.println("Fish Can not walk, Because it doesn't have legs");
	}

}
