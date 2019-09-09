package com.lsl.array;


public class Rotate {

	public static void main(String[] args) {
		int[] nums = new int[] {1,2,3,4,5,6,7};
		rotate(nums,3);
		int[] nums2 = new int[] {-1,-100,3,99};
		rotate(nums2,2);
		int[][] matrix = new int[][] {
			{5,1,9,11},
			{2,4,8,10},
			{13,3,6,7},
			{15,14,12,16}
		};
		rotate(matrix);
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				System.out.print(matrix[i][j] + ",");
			}
			System.out.println();
		}
		
	}
	public static void rotate(int[] nums, int k) {
		int len = nums.length;
        for (int i = 0; i < k; i++) {
			int temp = nums[len - 1];
			for (int j = len - 1; j > 0; j --) {
				nums[j] = nums[j - 1];
			}
			nums[0] = temp;
			
		}
       
    }
	
	public static void rotate(int[][] matrix) {
		int n = matrix.length;
		int[][] nums = new int[n][n];
        for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				nums[n - j - 1][n - i - 1] = matrix[i][j];
			}
		}
        for (int i = 0; i < nums.length / 2; i++) {
			int[] temp = nums[i];
			nums[i] = nums[n - i - 1];
			nums[n - i - 1] = temp; 
		}
        for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				matrix[i][j] = nums[i][j];
			}
			System.out.println();
		}
        
        
    }
	
	

}
