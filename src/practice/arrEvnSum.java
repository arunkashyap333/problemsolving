package practice;

public class arrEvnSum {
	
	public static void main(String[] args) {
		
		int[] val= {2,3,5,6,4,8,0};
		int sum=0;
		for (int i=0;i<val.length;i++) {
			if(val[i]%2==0) {
				sum=sum+val[i];
			}
		}
		System.out.println(sum);
	}

}
