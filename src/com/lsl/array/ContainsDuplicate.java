package com.lsl.array;

public class ContainsDuplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = new int[] {3,2,1};
		System.out.println(containsDuplicate(nums));
	}
	
	public static boolean containsDuplicate(int[] nums) {
		boolean b = false;
		for (int i = 0; i < nums.length; i++) {
			
			for (int j = 0; j < nums.length; j++) {
				
				if(i != j && nums[i] == nums[j]) {
					b = true;
					break;
				}
			}
			
		}
        return b;
    }

}
