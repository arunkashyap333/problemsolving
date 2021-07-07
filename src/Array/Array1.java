package Array;

public class Array1 {

	public static void main(String[] args) {
		int[][] arr = {
				{-9,-9,-9,1,1,1},
				{0,-9,0,4,3,2},
				{-9,-9,-9,1,2,3},
				{0,0,8,6,6,0},
				{0,0,0,-2,0,0},
				{0,0,1,2,4,0}
		};
		printArray(arr);
	}

	private static int printArray(int[][] arr) {
		int max = Integer.MIN_VALUE;
		int temp;
		for(int i=0;i<4;i++) {
			for(int j=0;j<4;j++) {
				temp = arr[i][j]+arr[i][j+1]+arr[i][j+2]+arr[i+1][j+1]+arr[i+2][j]+arr[i+2][j+1]+arr[i+2][j+2];
				if(temp > max) {
					max = temp;
				}
			}
		}
		 return max;
	}
}
