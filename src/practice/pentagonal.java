package practice;

public class pentagonal {

	void pentagon(int n) {
		if(n<1) {
			return;
		}
		int[] arr =new int[n];
		arr[0]=1;
		for(int i=1;i<n;i++) {
			arr[i] = arr[i-1] + (3*i+1);
		}
		for(int i=0;i<n;i++) {
			System.out.print(arr[i]+" ");
		}


	}

	public static void main(String[] args) {
		pentagonal obj1 = new pentagonal();
		obj1.pentagon(5);
	}

}
