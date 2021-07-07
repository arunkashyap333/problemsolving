package LeetCode;

public class SearchNum {
	
	public static void main(String[] args) {
		
		int nums[]= {2,3,5,6};
		int target=7;
		SearchNum a = new SearchNum();
		
		int ans = a.searchInsert(nums, target);
		System.out.println(ans);
		
	}
	
public int searchInsert(int[] nums, int target) {
	
	for(int i=0;i<nums.length;i++) {
		
		if(nums[i]>=target) {
			
			return i;
		}
	}
	return nums.length;
  }
}
