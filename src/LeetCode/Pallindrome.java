package LeetCode;

public class Pallindrome {
	
	public static void main(String[] args) {
		int x = -121;
		
		Pallindrome obj=new Pallindrome();
		boolean res= obj.isPalindrome(x);
		
		System.out.println(res);
		
	}
	
	public boolean isPalindrome(int x) {
		
		if(x<0) {
			
			return false;
		}
		
		int r=0;
		int result = 0;
		int test=x;
		while(x>0) {
			
			r=x%10;
			result=result*10+r;
			x=x/10;
		}
		if(result==test) {
			
			return true;
		}
		else {
			return false;
		}
		
	}

}
