package com.lsl.array;

public class PlusOne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {9,9,9,9,9};
		plusOne(nums);
		for (int i = 0; i < nums.length; i++) {
			System.out.println(nums[i]);
		}
		
	}
	
	public static int[] plusOne(int[] digits) {
		int[] result = new int[digits.length + 1];
		int x = 10;
		for (int i = digits.length - 1; i >= 0; i--) {
			if(x >= 10) {
				x = digits[i] + 1;
				digits[i] = x % 10;
			}
			result[i] = digits[i];
		}
		if(x >= 10) {
			result[0] = x / 10;
			return result;
		}
		return digits;
		
    }

}
