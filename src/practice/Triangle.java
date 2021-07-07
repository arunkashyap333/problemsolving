package practice;

public class Triangle {

	int s1,s2,s3;

	public Triangle(int s1,int s2,int s3) {
		this.s1 = s1;
		this.s2 = s2;
		this.s3 = s3;

	}
	int peri() {
		return s1+s2+s3;
	}
	int area() {
		return (1/2)*s1*s2;

	}
	public static void main(String[] args) {
		Triangle obj1 = new Triangle(3,4,5);
		System.out.println(obj1.peri());
		System.out.println(obj1.area());
	}	

}
