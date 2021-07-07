package Student;


public class MarksPercent{
	
	public static void main(String[] args) {
		
		Marks a = new A(90,70,40);
		Marks b = new B(90,78,73,69);
		char c = '%';
		
		MarksPercent mark = new MarksPercent();
		mark.print("Calculating Percentage");
		
		System.out.printf("Percentage for Student A is : %.2f%c\n", a.getPercentage(),c);
		System.out.println("Percentage for Student A is : "+ a.getPercentage());
		System.out.println("Percentage for Student B is : "+ b.getPercentage());
		System.out.printf("Percentage for Student B is : %.2f%c\n", b.getPercentage(),c);
	}
	
	private void print(String str) {
		System.out.println(str);
	}
}