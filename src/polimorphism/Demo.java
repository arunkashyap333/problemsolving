package polimorphism;

public class Demo {

	public static void main(String[] args) {
		Demo d= new Demo();
		System.out.println(d.sum(12, 14));
		System.out.println(d.sum(12,13,14));
	}
	
	//Method overloading
	private int sum(int a, int b, int c) {
		return a+b+c;
	}

	private int sum(int a, int b) {
		return a+b;
	}
}
