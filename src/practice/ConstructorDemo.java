package practice;

public class ConstructorDemo {
	
	//default contructor
//	public ConstructorDemo() {
//		System.out.println("Default Constructor");
//	}
	
	//parametaarized Constuctor
	public ConstructorDemo(int a) {
		System.out.println(a);
	}

	public static void main(String[] args) {
		ConstructorDemo cd = new ConstructorDemo(10);
		System.out.println("Done");
	}
}
