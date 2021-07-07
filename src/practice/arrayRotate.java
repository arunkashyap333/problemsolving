package practice;

public class arrayRotate {

	public static void main(String[] args) {

		int[] num= {1,2,3,4,5};
		print(num);
		int[] leftRotate = lefftShift(num);
		
		print(leftRotate);
		
	}
	
	private static void print(int[] arr) {
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}

	public static int[] lefftShift(int[] arr) {
		int temp = arr[0];
		for(int i=0;i<arr.length-1;i++) {
			arr[i] = arr[i+1];
		}
		arr[arr.length-1] = temp;
		return arr;
	}

//	public static int[] righftShift(int[] num) {
//
//	}
}
