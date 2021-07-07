package abstraction;

public class AreaShape extends Shape {

	
	double RectangleArea(double lenght, double breadth) {
		double area=0.0;
		area=lenght*breadth;
		return area;
	}

	
	double SquareArea(double side) {
		double area=0.0;
		area=side*side;
		return area;
	}

	
	double CircleArea(double radius) {
		double pi=3.14;
		double area=0.0;
		area=pi*radius*radius;
		return area;
	}

}
