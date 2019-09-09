package com.lsl.array;

public class RemoveDuplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {1,1,1,1};
		removeDuplicates(nums);
		//System.out.println();
		for (int i = 0; i < removeDuplicates(nums); i++) {
			System.out.println(nums[i]);
		}
	}
	
	public static int removeDuplicates(int[] nums) {
		int n = nums.length;
		for (int i = nums.length - 1; i >= 0; i--) {
		    for (int j = i - 1; j >= 0; j--) {
				if(nums[i] == nums[j]) {
					n --;
					System.out.println(i + "-------");
					for (int k = j; k < nums.length - 1; k++) {
						nums[k] = nums[k + 1];
					}
					break;
				}
			}
		    for (int l = 0; l < n; l ++) { 
				 System.out.print(nums[l] + ","); 
			}
		    System.out.println(""); 
		}
		 return 0;
	}

}
