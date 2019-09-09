package com.lsl.array;



public class MoveZeroes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = new int[] {0,0,1};
		moveZeroes(nums);
		for (int i = 0; i < nums.length; i++) {
			System.out.println(nums[i]);
		}
	}
	
	public static void moveZeroes(int[] nums) {
		int index = 0;
		while(index < nums.length) {
			if (nums[index] == 0) {
				int temp = nums[index];
				for (int i = index; i < nums.length - 1; i++) {
					nums[i] = nums[i + 1];
				}
				nums[nums.length - 1] = temp;
			}else {
				index ++;
			}
			boolean b = true;
			for (int i = index; i < nums.length; i++) {
				if (nums[i] != 0) {
					b = false;
					break;
				}
			}
			if (b) {
				break;
			}
		}
	}

}
