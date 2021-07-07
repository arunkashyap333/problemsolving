package abstraction;

public class AreaDemo {
	
	public static void main(String[] args) {
		
		AreaShape obj1=new AreaShape();
		
		
		System.out.println("Area of Circle is :"+obj1.CircleArea(5));
		System.out.println("Area of Rectangle is :"+obj1.RectangleArea(4, 5));
		System.out.println("Area of Square is :"+obj1.SquareArea(4));
		
	}

}
