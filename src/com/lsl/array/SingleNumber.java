package com.lsl.array;

public class SingleNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = new int[] {2,2,1};
		System.out.println(singleNumber(nums));
	}
	
	public static int singleNumber(int[] nums) {
		
		for (int i = 0; i < nums.length; i++) {
			boolean b = false;
			for (int j = 0; j < nums.length; j++) {
				
				if(i != j && nums[i] == nums[j]) {
					b = true;
					break;
				}
			}
			if(!b) {
				return nums[i];
			}
		}
        return -1;
    }

}
