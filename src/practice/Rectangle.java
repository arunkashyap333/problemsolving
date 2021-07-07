package practice;

public class Rectangle {
	
	private int length,breadth;
	
	public Rectangle() {
		System.out.println("Default Constructor");
		this.length=1;
		this.breadth=1;
	}
	
	public Rectangle(int lenght, int breadth) {
		System.out.println("Para Constructor");
		this.length=lenght;
		this.breadth=breadth;
	}
	private int Area() {
		return length*breadth;
	}
	

	public static void main(String[] args) {
		Rectangle obj1 = new Rectangle(4,5);
		Rectangle obj2 = new Rectangle(5,9);
		System.out.println(obj1.Area());
		System.out.println(obj2.Area());
		Rectangle obj3 = new Rectangle();
		System.out.println(obj3.Area());
		
		// TODO Auto-generated method stub

	}

}

