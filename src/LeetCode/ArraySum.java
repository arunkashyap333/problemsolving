package LeetCode;

public class ArraySum {

	public static void main(String[] args) {

		int nums[]= {2,3,5,6};
		int target=8;
		ArraySum a = new ArraySum();
		
		int[] ans = a.twoSum(nums, target);
		System.out.println(ans[0] +" " + ans[1]);
		
	}
	
	 public int[] twoSum(int[] nums, int target) {
	        
		 int[] ans = new int[2];
		 
		 for(int i=0;i<nums.length-1;i++) {

				for(int j=i+1;j<nums.length;j++) {

					if(nums[i]+nums[j]==target) {

						ans[0] = i;
						ans[1] = j;
						return ans;
					}

				}

			}
		 
		 return ans;
	    }

}
