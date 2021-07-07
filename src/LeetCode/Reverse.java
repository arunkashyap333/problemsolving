package LeetCode;

public class Reverse {
	public static void main(String[] args) {
		int x = 1534236469;
		System.out.println(x + " -> " + reverse(x));
	}

	public static int reverse(int x) {
		
		int r = 0;
		long result = 0;
		int sign = x <0 ? -1:1;
		x = x*sign;
		while(x>0) {
			r=x%10;
			result=result*10+r;
			
			x=x/10;
			
//		 return x;
			
		}
		if(result >= Math.pow(2, 31)) {
			return 0;
		}
//		System.out.println(result);
		return (int)result*sign;
	}
}
