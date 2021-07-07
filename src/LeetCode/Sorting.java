package LeetCode;

public class Sorting {
	
	public static void main(String[] args) {

		int nums[]= {1,1,2};
		
		Sorting obj = new Sorting();
		System.out.println(obj.removeDuplicates(nums));
		
		
	}
	
	

	public int removeDuplicates(int[] nums) {
		
		int counter=1;
		for(int i =0;i<nums.length-1;i++) {
			
			if(nums[i]!=nums[i+1]) {
				
				counter++;
			}
			
		}
		
		
		return counter;
	}


	}
