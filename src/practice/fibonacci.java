package practice;


public class fibonacci {

	public static void main(String[] args) {
		
		fibonacci obj1 = new fibonacci();
		obj1.fibo(5);

	}

	void fibo(int n) {
		if(n<0) {
			System.out.println("Enter a Positive Integer");
			return;
		}
		if(n==0) {
			System.out.println(n);
			return;
		}
		
		if(n>=1) {
			System.out.print("0 1");
		}
		
		int a=0;
		int b=1;
		int c=0;
		//logic
		
		for(int i=2;i<=n;i++) {
			c=a+b;
			a=b;
			b=c;
			System.out.print(" "+c);
		}
		

	}


}