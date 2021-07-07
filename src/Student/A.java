package Student;

public class A extends Marks{
	
	private double sub1,sub2,sub3;
	
	public A(double sub1,double sub2,double sub3) {
		this.sub1=sub1;
		this.sub2=sub2;
		this.sub3=sub3;
	}
	
	double getPercentage() {
		double percentage=0.0;
		percentage=(sub1+sub2+sub3)/3;
		return percentage;
	}

}
