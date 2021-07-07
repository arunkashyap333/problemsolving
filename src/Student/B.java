package Student;

public class B extends Marks{

	private double sub1,sub2,sub3,sub4;
	
	public B(double sub1,double sub2,double sub3,double sub4) {
		this.sub1 = sub1;
		this.sub2 = sub2;
		this.sub3 = sub3;
		this.sub4 = sub4;
	}
	@Override
	double getPercentage() {
		double percent = 0.0;
		percent = (sub1+sub2+sub3+sub4)/4;
		return  percent;
	}

}
